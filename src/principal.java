import java.io.*;

public class principal {
    public static void main(String[] args) {
        String filePath = "datos.dat";
        miclase miObjeto = new miclase("Juan",29);
        try (//try permite tratar de hacer algo, y nos ayuda a capturar el mensaje de error
             FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream obOut = new ObjectOutputStream(fileOut) )
        {
            obOut.writeObject(miObjeto);
            System.out.println("archivo escrito correctamente");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        ///////////////////
        try(
                FileInputStream fileIn = new FileInputStream(filePath);
                ObjectInputStream objIn = new ObjectInputStream(fileIn)
        )
        {
            miclase readObject = (miclase) objIn.readObject();
            System.out.println("El objeto en disco es: " + readObject);
        }catch (IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
