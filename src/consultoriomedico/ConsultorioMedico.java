/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultoriomedico;

import consultoriomedico.Entidades.Agenda;
import consultoriomedico.Entidades.Medicamento;
import consultoriomedico.Entidades.Paciente;
import consultoriomedico.Entidades.Consulta;
import java.util.ArrayList;
import java.util.Date;

import java.util.HashMap;
import javax.swing.*;

/**
 *
 * @author LGNOTE
 */
public class ConsultorioMedico {

    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static ArrayList<Medicamento> medicamentos = new ArrayList<>();
    static Agenda agendamentos = new Agenda();
    static ArrayList<Consulta> consultas = new ArrayList<>();

    public static void main(String[] args) {

        String option = new String();
        option = "0";
        do {
            option = JOptionPane.showInputDialog("Escolha uma opção:\n"
                    + "Sair = 0\n"
                    + "Cadastro de Paciente = 1\n"
                    + "Cadastro de Medicamento = 2\n"
                    + "Agendamento de consultas = 3\n"
                    + "Registro de consultas = 4\n"
                    + "Histórico = 5");
            try {
                switch (option) {
                    case "0":
                        System.out.println("Saindo");
                        break;

                    case "1":
                        System.out.println("Cadastro de Paciente");
                        cadastraPaciente();
                        break;

                    case "2":
                        System.out.println("Cadastro de Medicamento");
                        cadastraMedicamento();
                        break;

                    case "3":
                        System.out.println("Agendamento de consultas");
                        agendaConsulta();
                        break;
                }
            } catch (Exception e) {
                System.exit(0);
            }
            System.out.println(option.equals("0"));
        } while (!option.equals("0"));
    }

    static void cadastraPaciente() {
        String[] camposLabel = new String[]{"RG", "NOME", "ENDERECO", "TELEFONE"};
        ArrayList<String> camposValue = new ArrayList<String>();
        for (String item : camposLabel) {
            String option = JOptionPane.showInputDialog("Informe o seu " + item + ":");
            if (item.equals("RG") && verificaPacienteCadastrado(option)){
                JOptionPane.showMessageDialog(null, "Paciente já cadastrado");
                return;
            }
            if (option == null) {
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
        String[] camposLabel = new String[]{"NOME", "DESCRIÇÃO"};
        ArrayList<String> camposValue = new ArrayList<String>();
        for (String item : camposLabel) {
            String option = JOptionPane.showInputDialog(item + " do medicamento:");
            if (option == null) {
                JOptionPane.showMessageDialog(null, "Cadastro de medicamento cancelado");
                return;
            }
            camposValue.add(option);
        }
        Medicamento medicamento = new Medicamento(camposValue.get(0), camposValue.get(1));
        medicamentos.add(medicamento);
        JOptionPane.showMessageDialog(null, "Medicamento cadastrado!");
    }

    static void agendaConsulta() {
        if (pacientes.isEmpty()) {
            int option = JOptionPane.showConfirmDialog(null, "Sem pacientes para agendar consulta.\nDeseja cadastrar um paciente?");
            if (option == JOptionPane.YES_OPTION) {
                cadastraPaciente();
                agendaConsulta();
                return;
            } else {
                return;
            }
        }

        String lista = listaPacientes();
        String pacienteID = JOptionPane.showInputDialog("Lista de Pacientes:\n"
                + lista + "\n"
                + "Informe um paciente:");
        if (verificaPacienteCadastrado(pacienteID)){
            JOptionPane.showMessageDialog(null, "Paciente já cadastrado");
            return;
        }
        String horario = JOptionPane.showInputDialog("Informe o horario:");
        Date date = new Date(2015,1,1);
        System.out.println(date);
    }

    static boolean verificaPacienteCadastrado(String pacienteID) {
        for (Paciente paciente : pacientes) {
            if (paciente.getRg().equals(pacienteID)) {
                return true;
            }
        }
        return false;
    }

    static String listaPacientes() {
        String result = new String();
        for (Paciente paciente : pacientes) {
            result += paciente.getRg() + " - " + paciente.getNome() + "\n";
        }
        return result;
    }
}
