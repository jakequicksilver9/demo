package pojos;

import java.util.List;

public class Shop {
    private int shopId;
    private String shopName;
    private User admin;
    private List<User> users;

    public Shop(int shopId, String shopName, User admin) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.admin = admin;
        this.users = users;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public User getAdmin() {
        return admin;
    }

    public void setAdmin(User admin) {
        this.admin = admin;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
