package homework.onlineShop.command;

public interface Command {

    String LOGIN = "0";
    String REGISTER = "1";



    String LOG_OUT = "0";

    String REMOVE_PRODUCT_BY_ID = "1";
    String PRINT_USERS = "2";
    String PRINT_ORDERS = "3";
    String ADD_PRODUCT = "4";
    String CHANGE_ORDERS_STATUS = "5";



    String USER_LOG_OUT = "0";
    String PRINT_ALL_PRODUCTS = "1";
    String BUY_PRODUCT = "2";
    String PRINT_MY_ORDERS = "3";
    String CANCEL_ORDER_BY_ID = "4";

    static void adminCommands() {
        System.out.println("Please input" + LOG_OUT + "FOR LOG OUT");
        System.out.println("Please input" + PRINT_ALL_PRODUCTS + "FOR PRINT ALL PRODUCTS");
        System.out.println("Please input" + REMOVE_PRODUCT_BY_ID + "FOR REMOVE PRODUCT BY ID");
        System.out.println("Please input" + PRINT_USERS + "PRINT USERS");
        System.out.println("Please input" + PRINT_ORDERS + "PRINT ORDERS");
        System.out.println("Please input" + ADD_PRODUCT + "FOR ADD PRODUCT");
        System.out.println("Please input" + CHANGE_ORDERS_STATUS + "FOR CHANGE ORDERS STATUS");
    }

    static void userCommands() {
        System.out.println("Please input" + USER_LOG_OUT + "FOR USER LOG OUT");
        System.out.println("Please input" + BUY_PRODUCT + "FOR BY PRODUCT");
        System.out.println("Please input" + PRINT_MY_ORDERS + "FOR PRINT MY ORDERS");
        System.out.println("Please input" + CANCEL_ORDER_BY_ID + "FOR CANCEL ORDER BY ID");
    }
    static void firstCommands() {
        System.out.println("Please input" + LOGIN + "FOR LOGIN");
        System.out.println("Please input" + REGISTER + "FOR REGISTER");
    }

}
