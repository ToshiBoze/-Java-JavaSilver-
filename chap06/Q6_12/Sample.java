class Sample {
    private static Sample instance = null;
    private Sample() {}
    public static Sample getInstance(){
        if (instance == null) {
            instance = new Sample();
        }
        return instance;
    }
}
