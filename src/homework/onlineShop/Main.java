package homework.onlineShop;

import homework.onlineShop.command.Command;
import homework.onlineShop.model.*;

import javax.security.auth.login.LoginContext;
import java.util.Scanner;
import java.util.zip.Adler32;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static User currentUser;
    private static final Storage userStorage = new Storage();
    private static final Storage orderStorage = new Storage();
    private static final Storage praductStorage = new Storage();
    public static void main(String[] args) {
        userStorage.add(new User( "1","Narek", "narek@mail.ru", "1245",UserOrAdmin.ADMIN));
        boolean run = true;
        while (run) {
            Command.firstCommands();
            String command = SCANNER.nextLine();
            switch (command) {
                case Command.LOGIN:
                    login();
                    break;
                case Command.REGISTER:
                    register();
                    break;
            }
        }
    }

    private static void login() {
        System.out.println("Please input your email");
        String email = SCANNER.nextLine();
        System.out.println("Please input your password");
        String password = SCANNER.nextLine();
        User user = (User) userStorage.findUserBYEmail(email);
        if (CheckUtil.checkPassword(user,password)) {
            currentUser = user;
            if (user.getUserOrAdmin() == UserOrAdmin.ADMIN) {
                adminPanel();
            } else if (user.getUserOrAdmin() == UserOrAdmin.USER) {
                userPanel();
            }else {
                System.out.println("not correct, please try again");
                return;
            }
            System.out.println("Correct");
        }

    }



    private static  void register() {
        System.out.println("Please input your name");
        String name = SCANNER.nextLine();
        System.out.println("Please input your email");
        String email = SCANNER.nextLine();
        Object userByEmail = userStorage.findUserBYEmail(email);
        System.out.println("Please input your password");
        String password = SCANNER.nextLine();
        userStorage.add(new User(name, email, password, UserOrAdmin.USER));
        System.out.println("user already registered");
        login();
    }

    private static void adminPanel() {
        boolean run = true;
        while (run) {

            System.out.println("--------------------------------------------------------------------");
            System.out.println("Your profile" + currentUser.getName() + "your Role" + currentUser.getUserOrAdmin() +   "user id " + currentUser.getId());
            Command.adminCommands();
            String command = SCANNER.nextLine();
            switch (command) {
                case Command.LOG_OUT:
                    currentUser = null;
                    run = false;
                    break;
                case Command.REMOVE_PRODUCT_BY_ID:
                    System.out.println("Please input product id for delete product");
                    praductStorage.removeProductById(SCANNER.nextLine());
                case Command.PRINT_USERS:
                    userStorage.printUsers();
                    break;
                case Command.PRINT_ORDERS:
                    orderStorage.printOrders(currentUser);
                    break;
                case Command.ADD_PRODUCT:
                    addProduct();
                    break;
                case Command.CHANGE_ORDERS_STATUS:
                    changeOrderStatus();
                    break;
            }
        }
    }
    private static void changeOrderStatus(){
        orderStorage.print();
        System.out.println("Please input order id for change");
        Product product = (Product) orderStorage.changeOrderStatus(SCANNER.nextLine());
        if (product != null) {
            praductStorage.removeProductById(product.getId());
        }
    }
    private String changeUserRole() {
        System.out.println("input user id for change");
        String id = SCANNER.nextLine();
        User userId = (User) userStorage.getUserById(id);
        if (userId == null) {
            System.out.println("that user doesn't exist");
            return null;
        }
            userStorage.changeUserById(userId);
             return ("that user Role already ADMIN");
    }
    private  static void addProduct() {
        System.out.println("Please input product id");
        String id = SCANNER.nextLine();
        System.out.println("Please input product name");
        String name = SCANNER.nextLine();
        System.out.println("Please input product description");
        String description = SCANNER.nextLine();
        System.out.println("Please input product price");
        int price = Integer.parseInt(SCANNER.nextLine());
        System.out.println("PLease input product stockQty");
        int stock = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Please input product category");
        Category[] category = Category.values();
        String category1 = SCANNER.nextLine();
        Product product = new Product(id,name,description,price,stock,category[Integer.parseInt(category1)]);
    }
    private static void userPanel() {
        boolean run = true;
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("your profile " + currentUser.getName() + "your Role" + currentUser.getUserOrAdmin()  + "user id" + currentUser.getId());
            Command.userCommands();
            String command = SCANNER.nextLine();
            switch (command) {
                case Command.LOG_OUT:
                    currentUser = null;
                    run = false;
                    break;
                case Command.PRINT_ALL_PRODUCTS:
                    praductStorage.printAllProducts();
                    break;
                case Command.BUY_PRODUCT:
                    buy();
                    break;
                case Command.PRINT_MY_ORDERS:
                    orderStorage.printOrders(currentUser);
                    break;
                case Command.CANCEL_ORDER_BY_ID:
                    System.out.println("input id for cancel");
                    orderStorage.cancelOrderById(SCANNER.nextLine());
                    break;
            }
        }
    }
    private static void buy() {
        praductStorage.printAllProducts();
        System.out.println("Please choose product id");
        String productId = SCANNER.nextLine();
        Product product = (Product) praductStorage.getProductById(productId);
        if (product == null) {
            System.out.println("no this product");
            return;
        }
        System.out.println("how many products would you like");
        String count = SCANNER.nextLine();

    }
}