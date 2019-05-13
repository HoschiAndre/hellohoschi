package de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util;

import java.util.HashMap;
import java.util.Map;

public class HoschiStore {

    private static HoschiStore instance;
    private static Map<String, Hoschi> hoschiMap = new HashMap<>();

    private HoschiStore() {
        init();
    }

    public static HoschiStore getInstance() {

        System.out.println("getInstance()");

        if (instance == null) {
            instance = new HoschiStore();
            System.out.println("getInstance() == null");
        }

        return instance;
    }

    private void init() {

        Hoschi hoschiAndre = new Hoschi();

        hoschiAndre.setFirstName("Andre");
        hoschiAndre.setLastName("Hoschi");
        hoschiAndre.setNickName("HoschiNick");
        hoschiAndre.setMagicNo(42);
        hoschiAndre.setFancyNo(123);

        hoschiMap.put(hoschiAndre.getNickName(), hoschiAndre);

        Hoschi hoschiBeate = new Hoschi();

        hoschiBeate.setFirstName("Beate");
        hoschiBeate.setLastName("Hoschi");
        hoschiBeate.setNickName("BeateNick");
        hoschiBeate.setMagicNo(72);
        hoschiBeate.setFancyNo(321);

        hoschiMap.put(hoschiBeate.getNickName(), hoschiBeate);

        System.out.println("init(): " + hoschiMap.toString());

    }

    public void addHoschi(Hoschi hoschi) {
        hoschiMap.put(hoschi.getNickName(), hoschi);
    }

    public Map getAllHoschis() {
        return hoschiMap;
    }

    public Hoschi getHoschi(String nickName) {
        return hoschiMap.get(nickName);
    }



}
