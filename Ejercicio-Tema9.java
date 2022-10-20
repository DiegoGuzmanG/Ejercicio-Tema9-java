public class Main {
    public static void main(String[] args) {
        //CLASE PERSONA
        System.out.println("PERSONA:");
        Persona persona = new Persona();
        persona.setEdad(34);
        System.out.println(persona.getEdad());
        persona.setNombre("Diego");
        System.out.println(persona.getNombre());
        persona.setTelefono(3115318635);
        System.out.println(persona.getTelefono());
        //CLASE CLIENTE
        System.out.println("\n CLIENTE: ");
        Cliente cliente = new Cliente();
        cliente.setEdad(34);
        System.out.println(cliente.getEdad());
        cliente.setNombre("Claudia");
        System.out.println(cliente.getNombre());
        cliente.setEdad(35);
        System.out.println(cliente.getTelefono());
        cliente.setCredito(9000);
        System.out.println(cliente.getCredito());
        //CLASE TRABAJADOR
        System.out.println("\n TRABAJADOR:");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(18);
        System.out.println(trabajador.getEdad());
        trabajador.setNombre("Macarena");
        System.out.println(trabajador.getNombre());
        trabajador.setTelefono(3143328252);
        System.out.println(trabajador.getTelefono());
        trabajador.setSalario(5520154);
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    public int getTelefono (){
        return this.telefono;
    }

}

class Cliente extends Persona {
    int credito;
    public void setCredito(int credito){
        this.credito=credito;
    }
    public int getCredito(){
        return this.credito;
    }

}
class Trabajador extends Persona {
    float salario;
    public void setSalario(float salario){
        this.salario=salario;
    }
    public float getSalario(){
        return this.salario;
    }
}
