package com.encore.test2;

import java.util.Scanner;

public class WorkshopTest2 {
	
	
    public static String gameResult(String playerResult) {
        int comResult = (int) (Math.random() * 3) + 1;
        String result = "";

        switch (playerResult) {
            case "����":
                if (comResult == 1) {
                    result = "��ȿ";
                } else if (comResult == 2) {
                    result = "�й�";
                } else {
                    result = "�¸�";
                }
                break;
            case "����":
                if (comResult == 2) {
                    result = "��ȿ";
                } else if (comResult == 3) {
                    result = "�й�";
                } else {
                    result = "�¸�";
                }
                break;
            case "��":
                if (comResult == 3) {
                    result = "��ȿ";
                } else if (comResult == 1) {
                    result = "�й�";
                } else {
                    result = "�¸�";
                }
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
        System.out.println("1. 5�� 3��");
        System.out.println("2. 3�� 2��");
        System.out.println("3. 1�� 1��");

        int playerScore = 0;
        int comScore = 0;

        boolean escape = false;

        System.out.println("��ȣ�� �Է��ϼ���.");
        int game = sc.nextInt();

        System.out.println("#### " + game + "���� �� �̽��ϴ�. ���ӽ���. ####");

        switch (game) {
            case 1:
                while (!escape) {
                    if (playerScore == 3) {
                        System.out.println("�÷��̾� ���� �¸�");
                        escape = true;
                        break;
                    } else if (comScore == 3) {
                        System.out.println("��ǻ�� ���� �¸�");
                        escape = true;
                        break;
                    }

                    System.out.println("���������� �� �ϳ� �Է� : ");
                    String player = sc.next();
                    String result = gameResult(player);

                    if (result.equals("�¸�")) {
                        System.out.println("�¸��߽��ϴ�.");
                        playerScore++;
                    } else if (result.equals("�й�")) {
                        System.out.println("�й��߽��ϴ�.");
                        comScore++;
                    } else
                        System.out.println("�����ϴ�. ������ �ٽ��մϴ�.");
                }
                break;

            case 2:
                while (!escape) {
                    if (playerScore == 2) {
                        System.out.println("�÷��̾� ���� �¸�");
                        escape = true;
                        break;
                    } else if (comScore == 2) {
                        System.out.println("��ǻ�� ���� �¸�");
                        escape = true;
                        break;
                    }

                    System.out.println("���������� �� �ϳ� �Է� : ");
                    String player = sc.next();
                    String result = gameResult(player);

                    if (result.equals("�¸�")) {
                        System.out.println("�¸��߽��ϴ�.");
                        playerScore++;
                    } else if (result.equals("�й�")) {
                        System.out.println("�й��߽��ϴ�.");
                        comScore++;
                    } else
                        System.out.println("�����ϴ�. ������ �ٽ��մϴ�.");
                }
                break;


            case 3:
                while (!escape) {
                    if (playerScore == 1) {
                        System.out.println("�÷��̾� ���� �¸�");
                        escape = true;
                        break;
                    } else if (comScore == 1) {
                        System.out.println("��ǻ�� ���� �¸�");
                        escape = true;
                        break;
                    }

                    System.out.println("���������� �� �ϳ� �Է� : ");
                    String player = sc.next();
                    String result = gameResult(player);

                    if (result.equals("�¸�")) {
                        System.out.println("�¸��߽��ϴ�.");
                        playerScore++;
                    } else if (result.equals("�й�")) {
                        System.out.println("�й��߽��ϴ�.");
                        comScore++;
                    } else
                        System.out.println("�����ϴ�. ������ �ٽ��մϴ�.");
                }
                break;

            default:
                System.err.println("�ùٸ� ���ڸ� �Է��ϼ���.");
                System.exit(0);
        }

    }

}
