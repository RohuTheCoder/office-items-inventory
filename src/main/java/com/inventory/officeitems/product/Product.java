package com.inventory.officeitems.product;

import jakarta.persistence.*;

@Entity
@Table(name = "office_data")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    int row_id;
    String order_id;
    String order_date;
    String ship_date;
    String ship_mode;
    String customer_id;

    String customer_name;

    String segment;

    String country;

    String city;

    String state;

    Double postal_code;

    String region;

    String product_id;

    String category;

    String sub_category;

    String product_name;

    float sales;
    int quantity;

    float discount;

    float profit;
    public Product()
    {

    }
    public Product( int row_id, String order_id, String Order_Date, String Ship_Date, String Ship_Mode, String Customer_ID,
                    String Customer_Name, String Segment, String Country, String city, String State, Double Postal_Code,String Region,
                    String Product_ID, String category, String Sub_Category, String Product_Name, float Sales, int Quantity,
                    float Discount,float Profit)
    {
        this.row_id = row_id;
        this.order_id =order_id;
        this.order_date = Order_Date;
        this.ship_date = Ship_Date;
        this.ship_mode = Ship_Mode;
        this.customer_id = Customer_ID;
        this.customer_name = Customer_Name;
        this.segment = Segment;
        this.country = Country;
        this.city = city;
        this.state = State;
        this.postal_code = Postal_Code;
        this.region = Region;
        this.product_id = Product_ID;
        this.category = category;
        this.sub_category = Sub_Category;
        this.product_name = Product_Name;
        this.sales = Sales;
        this.quantity = Quantity;
        this.discount = Discount;
        this.profit = Profit;
    }

    //getters and setters


    public int getRow_ID() {
        return row_id;
    }

    public void setRow_ID(int row_ID){row_id = row_ID;
    }

    public String getOrder_ID() {
        return order_id;
    }

    public void setOrder_ID(String order_ID) {
        order_id = order_ID;
    }

    public String getOrder_Date() {
        return order_date;
    }

    public void setOrder_Date(String order_Date) {
        order_date = order_Date;
    }

    public String getShip_Date() {
        return ship_date;
    }

    public void setShip_Date(String ship_Date) {
        ship_date = ship_Date;
    }

    public String getShip_Mode() {
        return ship_mode;
    }

    public void setShip_Mode(String ship_Mode) {
        ship_mode = ship_Mode;
    }

    public String getCustomer_ID() {
        return customer_id;
    }

    public void setCustomer_ID(String customer_ID) {
        customer_id = customer_ID;
    }

    public String getCustomer_Name() {
        return customer_name;
    }

    public void setCustomer_Name(String customer_Name) {
        customer_name = customer_Name;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String Segment) {
        segment = Segment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String Country) {
        country = Country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String City) {
        city = City;
    }

    public String getState() {
        return state;
    }

    public void setState(String State) {
        state = State;
    }

    public Double getPostal_Code() {
        return postal_code;
    }

    public void setPostal_Code(Double postal_Code) {
        postal_code = postal_Code;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String Region) {
        region = Region;
    }

    public String getProduct_ID() {
        return product_id;
    }

    public void setProduct_ID(String product_ID) {
        product_id = product_ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String Category) {
        category = Category;
    }

    public String getSub_Category() {
        return sub_category;
    }

    public void setSub_Category(String sub_Category) {
        sub_category = sub_Category;
    }

    public String getProduct_Name() {
        return product_name;
    }

    public void setProduct_Name(String product_Name) {
        product_name = product_Name;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float Sales) {
        sales = Sales;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int Quantity) {
        quantity = Quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float Discount) {
        discount = Discount;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float Profit) {
        profit = Profit;
    }
}


