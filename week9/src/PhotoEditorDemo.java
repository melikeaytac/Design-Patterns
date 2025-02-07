import java.util.List;

public class PhotoEditorDemo {
    public static void main(String[] args) {

        Photo photo= new Photo("test.jpg");

        MacroCommand portraitEnhancement=new MacroCommand("portraitEnhancement");
        System.out.println("Portrait Effect ");
        portraitEnhancement.add(new BrightnessCommand(photo,10));
        portraitEnhancement.add(new ContrastCommand(photo,15));
        portraitEnhancement.add(new SharpenCommand(photo,5));
        portraitEnhancement.execute();
        System.out.println(" ");

        MacroCommand vintageEffect=new MacroCommand("vintage Effect");
        System.out.println("Vintage Effect ");
        vintageEffect.add(new ColorCommand(photo,-15));
        vintageEffect.add(new ContrastCommand(photo,-10));
        vintageEffect.add(new BlurCommand(photo,3));
        vintageEffect.execute();
        System.out.println(" ");


        MacroCommand HDREffect=new MacroCommand("HDR Effect");
        System.out.println("HDR Effect ");
        HDREffect.add(new ColorCommand(photo,15));
        HDREffect.add(new ContrastCommand(photo,25));
        HDREffect.add(new SharpenCommand(photo,10));
        HDREffect.add(new BrightnessCommand(photo,20));
        HDREffect.execute();



    }
}