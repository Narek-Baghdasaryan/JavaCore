package homework.onlineShop;


import homework.onlineShop.model.*;
import homework.onlineShop.OutOfStockException;
import java.util.Objects;
public class Storage {
    Object[] array = new Object[10];
    private int size;

    public void add(Object value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Object[] tmp = new Object[array.length + 10];
        if (size >= 0)
            System.arraycopy(array, 0, tmp, 0, size);
        array = tmp;
    }

    public void printAllProducts() {
        for (int i = 0; i <= size; i++) {
            System.out.println(array[i]);
        }
    }

    public void removeProductById(String id) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof Product product) {
                if (product.getId().equals(id)) {
                    for (int j = i; j <= size; j++) {
                        array[j] = array[j + 1];
                    }
                    array[size] = null;
                    size--;
                    break;
                }
            }
        }
    }

    public void printUsers() {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof User user && user.getUserOrAdmin() == UserOrAdmin.USER) {
                System.out.println(user);
            }
        }
    }

    public void printOrders(Object currentUser) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof Order order && order.getUser().equals(currentUser)) {
                System.out.println(array[i]);
            }
        }
    }

    public Object getProductById(String id) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof Product product && product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public double priceOfProduct(Product product, double count) throws OutOfStockException {
        if (product.getStockQty() < count || product.getStockQty() == 0) {
            throw new OutOfStockException("in stock doesn't have that count");
        }
        return product.getPrice() * count;
    }

    public void cancelOrderById(String id) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof Order order && order.getId().equals(id)) {
                order.setOrderStatus(OrderStatus.CANCELED);
                return;
            }
        }
    }

    public Object changeOrderStatus(String id) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof Order order && order.toString().equals(id)) {
                order.setOrderStatus(OrderStatus.DELIVERED);
                order.getProduct().setStockQty(order.getProduct().getStockQty() - order.getQty());
                if (order.getProduct().getStockQty() == 0){
                    return order.getProduct();
                }
            }
        }
        return null;
    }
    public Object getUserById(String id) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof User user && user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
    public void changeUserById(User userById) {
        userById.setUserOrAdmin(UserOrAdmin.ADMIN);
    }
    public Object findUserBYEmail(String email) {
        for (int i = 0; i <= size; i++) {
            if (array[i] instanceof User user) {
                if (user.getEmail().equals(email)) {
                    return user;
                }
            }
        }
        return null;
    }

    public void print() {
        //TODO
    }
}
