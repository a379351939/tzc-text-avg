package com.play;


import java.util.Map;
import java.util.Scanner;

public class TheInterface {
    private Map<String, String> sceneMap;
    private Map<String, Map<String,String>> nextSceneMap;

    public TheInterface(Map<String, String> sceneMap, Map<String, Map<String,String>> nextSceneMap, String firstSc) {
        this.sceneMap = sceneMap;
        this.nextSceneMap = nextSceneMap;

        run(firstSc);
    }

    private void run(String key){
        System.out.println(sceneMap.get(key));

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String nextSceneKey = nextSceneMap.get(key) != null ? nextSceneMap.get(key).get(line) : null;

        // 判断值是否为 null，如果是，则退出程序
        if (nextSceneKey == null) {
            System.out.println("程序不知道你想干啥，游戏结束");
            System.exit(0);
        } else {
            run(nextSceneKey);
        }
    }

}