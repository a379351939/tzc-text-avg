package com.play;


import java.util.Map;
import java.util.Scanner;

public class TheInterface {
    private Map<String, String> sceneMap;
    private Map<String, Map<String,String>> nextSceneMap;

    public TheInterface(Map<String, String> sceneMap, Map<String, Map<String,String>> nextSceneMap) {
        this.sceneMap = sceneMap;
        this.nextSceneMap = nextSceneMap;

        run("begin");
    }

    private void run(String key){
        System.out.println(sceneMap.get(key));

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String nextSceneKey = nextSceneMap.get(key) != null ? nextSceneMap.get(key).get(line) : null;

        // 判断值是否为 null，如果是，则退出程序
        if (nextSceneKey == null) {
            System.out.println("Value not found. Exiting program.");
            System.exit(0);
        } else {
            run(nextSceneKey);
        }
    }

}