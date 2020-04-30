package sample;

public class InvalidPrisException  extends  IllegalArgumentException {
    public InvalidPrisException() {
        super("Pris må være stærre enn  0 og kun tall " );
    }



}
