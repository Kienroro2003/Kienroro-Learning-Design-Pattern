package sesson_2_factory_design_pattern;

public final class Application {
    public interface Product{};

    public static class ConcreteProduct implements  Product{}

    public static class Factory{
        public Product newProduct(){
            return new ConcreteProduct();
        }
    }

    public static void main(String[] args){
        final Factory factory = new Factory();
        final Product product = factory.newProduct();
    }
}
