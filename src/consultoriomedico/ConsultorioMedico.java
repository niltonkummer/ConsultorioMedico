/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LGNOTE
 */
public class ConsultorioMedico {

    static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    static ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();

    public static void main(String[] args) {
        boolean rodando = true;
        while (rodando) {
            String option = JOptionPane.showInputDialog("O que deseja cadastrar:\nPaciente = 1\nMedicamento = 2");
            try{
            switch (option) {
                case "1":
                    System.out.println("Cadastro de Paciente");
                    cadastraPaciente();
                    break;

                case "2":
                    System.out.println("Cadastro de Medicamento");
                    cadastraMedicamento();
                    break;

                default:
                    System.out.println("Opção desconhecida");
                    break;
            }
            }catch(Exception e){
                System.exit(0);
            }
        }
    }

    static void cadastraPaciente() {
        String[] camposLabel = new String[]{"RG","NOME","ENDERECO","TELEFONE"};
        ArrayList<String> camposValue = new ArrayList<String>();
        for (String item : camposLabel) {
            String option = JOptionPane.showInputDialog("Informe o seu "+item+":");
            if (option == null){
                JOptionPane.showMessageDialog(null, "Cadastro de paciente cancelado");
                return;
            } 
            camposValue.add(option);
        }
        Paciente paciente = new Paciente(camposValue.get(0), camposValue.get(1), camposValue.get(2), camposValue.get(3));
        pacientes.add(paciente);
        JOptionPane.showMessageDialog(null, "Paciente cadastrado!");
    }

    static void cadastraMedicamento() {
                String[] camposLabel = new String[]{"RG","NOME","ENDERECO","TELEFONE"};
        ArrayList<String> camposValue = new ArrayList<String>();
        for (String item : camposLabel) {
            String option = JOptionPane.showInputDialog("Informe o seu "+item+":");
            if (option == null){
                JOptionPane.showMessageDialog(null, "Cadastro de medicamento cancelado");
                return;
            } 
            camposValue.add(option);
        }
        Paciente paciente = new Paciente(camposValue.get(0), camposValue.get(1), camposValue.get(2), camposValue.get(3));
        pacientes.add(paciente);
        JOptionPane.showMessageDialog(null, "Medicamento cadastrado!");
    }
}
