
public class Product {
    int code;
    double price;
    boolean eligible;
    int quantity;
    String name;

    Product(int ncode, double nprice, boolean eligibility, String newname) {
        code = ncode;
        price = nprice;
        eligible = eligibility;
        name = newname;
    }
