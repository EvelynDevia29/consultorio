/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import logica.Medicamento;

/**
 *
 * @author Juan Rojas
 */
public class MedicamentoGuardar {

    public static void main(String[] args) {
        Medicamento m = new Medicamento();
        m.setNombreMedicamento("Natsulin");
        if (m.guardarMedicamento()) {
            System.out.println("Ejecutada");
        } else {
            System.out.println("No ejecutada");
        }
    }
}
