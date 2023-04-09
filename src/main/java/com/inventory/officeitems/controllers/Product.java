package com.inventory.officeitems.controllers;

public class Product {
    int Row_ID;
    String Order_ID;
    String Order_Date;
    String Ship_Date;
    String Ship_Mode;
    String Customer_ID;
    String Customer_Name;
    String Segment;
    String Country;
    String City;
    String State;
    Double Postal_Code;
    String Region;
    String Product_ID;
    String Category;
    String Sub_Category;
    String Product_Name;
    float Sales;
    int Quantity;
    float Discount;
    float Profit;
    public Product()
    {

    }
    public Product( int Row_ID, String Order_ID, String Order_Date, String Ship_Date, String Ship_Mode, String Customer_ID,
    String Customer_Name, String Segment, String Country, String City, String State, Double Postal_Code,String Region,
    String Product_ID, String Category, String Sub_Category, String Product_Name, float Sales, int Quantity,
    float Discount,float Profit)
    {
        this.Row_ID = Row_ID;
        this.Order_ID = Order_ID;
        this.Order_Date = Order_Date;
        this.Ship_Date = Ship_Date;
        this.Ship_Mode = Ship_Mode;
        this.Customer_ID = Customer_ID;
        this.Customer_Name = Customer_Name;
        this.Segment = Segment;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.Postal_Code = Postal_Code;
        this.Region = Region;
        this.Product_ID = Product_ID;
        this.Category = Category;
        this.Sub_Category = Sub_Category;
        this.Product_Name = Product_Name;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
        this.Profit = Profit;
    }

    //getters and setters


    public int getRow_ID() {
        return Row_ID;
    }

    public void setRow_ID(int row_ID) {
        Row_ID = row_ID;
    }

    public String getOrder_ID() {
        return Order_ID;
    }

    public void setOrder_ID(String order_ID) {
        Order_ID = order_ID;
    }

    public String getOrder_Date() {
        return Order_Date;
    }

    public void setOrder_Date(String order_Date) {
        Order_Date = order_Date;
    }

    public String getShip_Date() {
        return Ship_Date;
    }

    public void setShip_Date(String ship_Date) {
        Ship_Date = ship_Date;
    }

    public String getShip_Mode() {
        return Ship_Mode;
    }

    public void setShip_Mode(String ship_Mode) {
        Ship_Mode = ship_Mode;
    }

    public String getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(String customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getSegment() {
        return Segment;
    }

    public void setSegment(String segment) {
        Segment = segment;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Double getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(Double postal_Code) {
        Postal_Code = postal_Code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getProduct_ID() {
        return Product_ID;
    }

    public void setProduct_ID(String product_ID) {
        Product_ID = product_ID;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSub_Category() {
        return Sub_Category;
    }

    public void setSub_Category(String sub_Category) {
        Sub_Category = sub_Category;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String product_Name) {
        Product_Name = product_Name;
    }

    public float getSales() {
        return Sales;
    }

    public void setSales(float sales) {
        Sales = sales;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public float getDiscount() {
        return Discount;
    }

    public void setDiscount(float discount) {
        Discount = discount;
    }

    public float getProfit() {
        return Profit;
    }

    public void setProfit(float profit) {
        Profit = profit;
    }
}
