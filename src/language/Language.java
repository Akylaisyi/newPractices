package language;

public interface Language {
    public static final String DEFAULT_ENCODING="UTF-8";//public static final automatic
    public abstract void hello();
    abstract void bye();
    static void description(){
        System.out.println("Language have the ability to express thoughtd and ideas to others using units of sound like words sentences, There often rules or syntax for how the words come together");
    }

}
