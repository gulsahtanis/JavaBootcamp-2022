public class Product2 {

    public Product2(){

    }
    public Product2(int _id,String _name,String _description){
        System.out.println("Yapici blok calisti");
        this._name=_name;
        this._id=_id;
        this._description=_description;
    }
    //attiribute
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmounth;

    //getter
    public void setId(int id) {
        _id=id;
    }
    //setter
    public int getId() {
        return _id;
    }


    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public int getStockAmounth() {
        return _stockAmounth;
    }

    public void setStockAmounth(int stockAmounth) {
        _stockAmounth = stockAmounth;
    }
}
