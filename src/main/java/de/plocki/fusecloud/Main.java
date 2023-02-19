package de.plocki.fusecloud;

import de.plocki.fusecloud.discord.DiscordBot;
import de.plocki.fusecloud.manager.Manager;
import de.plocki.fusecloud.wrapper.Wrapper;

public class Main {
    public static void main(String[] args) {
        if(args[0] == null) {
            System.out.println("Please use the following arguments:\n\nwrapper\nmanager\ndiscordbot\n\nafter the jar.");
        } else if(args[0].equalsIgnoreCase("wrapper")) {

            Wrapper wrapper = new Wrapper();
            wrapper.start();

        } else if(args[0].equalsIgnoreCase("manager")) {

            Manager manager = new Manager();
            manager.start();

        } else if(args[0].equalsIgnoreCase("discordbot")) {

            DiscordBot bot = new DiscordBot();
            bot.start();

        } else {
            System.out.println("Please use the following arguments:\n\nwrapper\nmanager\ndiscordbot\n\nafter the jar.");
        }
    }
}