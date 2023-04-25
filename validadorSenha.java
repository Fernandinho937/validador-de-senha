import javax.swing.JOptionPane;

public class validadorSenha {
    public static void main(String[] args){
    String senha = JOptionPane.showInputDialog("Digite a senha :");
    int contador = 1;

    while(!senha.equals("1234") && contador<=2){
        contador++;
        senha = JOptionPane.showInputDialog("Senha incorreta: \nTentativas restantes: "+(3-contador));
    }

    System.out.println();
        if(senha.equals("1234")){
        JOptionPane.showMessageDialog(null, "Senha válida, acesso permitido!");
    }else{
        JOptionPane.showMessageDialog(null, "Senha inválida" );    

    }
}}

