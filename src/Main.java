public class Main {
    public static void main(String[] args) {
        BasicStructure honda=new BasicStructure();
        honda.color="white";
        honda.model="accord";
        honda.power="500cc";

        engine engine=new engine();
        engine.horsepower="125";
        engine.size="1.5";
        engine.cilinder="4";

        lights lights=new lights();
        lights.color="yellow";
        lights.size="big & small";
        lights.intensity="low beam";
    }
}