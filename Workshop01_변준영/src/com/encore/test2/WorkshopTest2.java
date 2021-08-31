package com.encore.test2;

import java.util.Scanner;

public class WorkshopTest2 {
	
	
    public static String gameResult(String playerResult) {
        int comResult = (int) (Math.random() * 3) + 1;
        String result = "";

        switch (playerResult) {
            case "가위":
                if (comResult == 1) {
                    result = "무효";
                } else if (comResult == 2) {
                    result = "패배";
                } else {
                    result = "승리";
                }
                break;
            case "바위":
                if (comResult == 2) {
                    result = "무효";
                } else if (comResult == 3) {
                    result = "패배";
                } else {
                    result = "승리";
                }
                break;
            case "보":
                if (comResult == 3) {
                    result = "무효";
                } else if (comResult == 1) {
                    result = "패배";
                } else {
                    result = "승리";
                }
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
        System.out.println("1. 5판 3승");
        System.out.println("2. 3판 2승");
        System.out.println("3. 1판 1승");

        int playerScore = 0;
        int comScore = 0;

        boolean escape = false;

        System.out.println("번호를 입력하세요.");
        int game = sc.nextInt();

        System.out.println("#### " + game + "번을 고르 셨습니다. 게임시작. ####");

        switch (game) {
            case 1:
                while (!escape) {
                    if (playerScore == 3) {
                        System.out.println("플레이어 최종 승리");
                        escape = true;
                        break;
                    } else if (comScore == 3) {
                        System.out.println("컴퓨터 최종 승리");
                        escape = true;
                        break;
                    }

                    System.out.println("가위바위보 중 하나 입력 : ");
                    String player = sc.next();
                    String result = gameResult(player);

                    if (result.equals("승리")) {
                        System.out.println("승리했습니다.");
                        playerScore++;
                    } else if (result.equals("패배")) {
                        System.out.println("패배했습니다.");
                        comScore++;
                    } else
                        System.out.println("비겼습니다. 게임을 다시합니다.");
                }
                break;

            case 2:
                while (!escape) {
                    if (playerScore == 2) {
                        System.out.println("플레이어 최종 승리");
                        escape = true;
                        break;
                    } else if (comScore == 2) {
                        System.out.println("컴퓨터 최종 승리");
                        escape = true;
                        break;
                    }

                    System.out.println("가위바위보 중 하나 입력 : ");
                    String player = sc.next();
                    String result = gameResult(player);

                    if (result.equals("승리")) {
                        System.out.println("승리했습니다.");
                        playerScore++;
                    } else if (result.equals("패배")) {
                        System.out.println("패배했습니다.");
                        comScore++;
                    } else
                        System.out.println("비겼습니다. 게임을 다시합니다.");
                }
                break;


            case 3:
                while (!escape) {
                    if (playerScore == 1) {
                        System.out.println("플레이어 최종 승리");
                        escape = true;
                        break;
                    } else if (comScore == 1) {
                        System.out.println("컴퓨터 최종 승리");
                        escape = true;
                        break;
                    }

                    System.out.println("가위바위보 중 하나 입력 : ");
                    String player = sc.next();
                    String result = gameResult(player);

                    if (result.equals("승리")) {
                        System.out.println("승리했습니다.");
                        playerScore++;
                    } else if (result.equals("패배")) {
                        System.out.println("패배했습니다.");
                        comScore++;
                    } else
                        System.out.println("비겼습니다. 게임을 다시합니다.");
                }
                break;

            default:
                System.err.println("올바른 숫자를 입력하세요.");
                System.exit(0);
        }

    }

}
