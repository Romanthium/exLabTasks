package com.example.touristguide.bot;

import com.example.touristguide.modell.City;
import com.example.touristguide.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Optional;

@Component
public class BotService extends TelegramLongPollingBot {

    private final BotConfig config;
    private final CityService cityService;

    private Optional<City> city;

    @Autowired
    public BotService(BotConfig config, CityService cityService) {
        super(config.getToken());
        this.config = config;
        this.cityService = cityService;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            if (messageText.equals("/start")) {
                startCommandReceived(chatId, update.getMessage().getChat().getFirstName());
            } else if (isCityExists(messageText)) {
                sendMessage(chatId, getCityInfo());
            } else {
                sendMessage(chatId, "I don't know this city yet, try another one");
            }
        }
    }

    private boolean isCityExists(String cityName) {
        city = cityService.findByName(cityName);
        return city.isPresent();
    }

    private String getCityInfo() {
        return city.get().getInfo();
    }

    private void startCommandReceived(long chatId, String userFirsName) {
        String answer = "Hi, " + userFirsName + ", nice to meet you!";

        sendMessage(chatId, answer);
    }

    private void sendMessage(long chatId, String textToSend) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(textToSend);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.getMessage();
        }
    }

    @Override
    public String getBotUsername() {
        return config.getName();
    }
}
