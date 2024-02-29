package com.play;

import java.util.HashMap;
import java.util.Map;

public class Story01  {

    public Story01() {

    }

    public static void runStory(){
         Map<String, String> sceneMap =  new HashMap<>();
         Map<String, Map<String,String>> nextSceneMap = new HashMap<>();


        sceneMap.put("begin", "《裤子的传说》\n" +
                "\n" +
                "故事开始于一个古老而神秘的王国，那里有一个传说中的勇者，名字叫裤子。裤子并不是因为穿着裤子而得名，而是因为他的勇气和智慧，总是能从困境中找到出路。\n" +
                "\n" +
                "裤子的冒险从一个小村庄开始，村庄居民们生活安宁，直到有一天，一群邪恶的怪物袭击了村庄。村民们感到绝望，而此时，裤子出现在村庄。\n" +
                "\n" +
                "现在，裤子面临着两个不同的选择：\n" +
                "\n" +
                "选择1：与村庄的领袖商议\n" +
                "\n" +
                "选择2：寻找当地的智者寻求建议");

        nextSceneMap.put("begin", new HashMap<String, String>() {{
            put("1", "1");
        }});



        sceneMap.put("1", "选择1：与村庄的领袖商议\n" +
                "\n" +
                "裤子决定首先与村庄的领袖会面，了解更多有关怪物袭击的信息。领袖告诉裤子，怪物似乎是从附近的森林涌现而出。裤子可以选择：\n" +
                "\n" +
                "选择1.1：前往森林调查\n" +
                "\n" +
                "选择1.2：与领袖合作，制定防御计划\n");

        nextSceneMap.put("1", new HashMap<String, String>() {{
            put("1", "1.1");
        }});




        sceneMap.put("1.1", "选择1.1：前往森林调查\n" +
                "\n" +
                "裤子踏上了前往森林的征途，穿越浓密的树木和险峻的山脉。在森林深处，裤子遇到了一位神秘的精灵，她似乎知道有关怪物袭击的一切。精灵告诉裤子，邪恶势力的源头在远处的古老神庙中。裤子是否要继续前行，直面未知的危险？\n" +
                "\n" +
                "选择1.1.1：冒险进入神庙\n" +
                "\n" +
                "选择1.1.2：返回村庄报告精灵的信息\n");


        new TheInterface(sceneMap, nextSceneMap, "begin");
    }
}