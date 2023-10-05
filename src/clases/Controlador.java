/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.vistaBienvenida;
import vistas.vistaCelulares;
import vistas.vistaComputadores;
import vistas.vistaTelevisores;

/**
 *
 * @author Rain
 */
public class Controlador implements ActionListener {

    //Def objects, classes and views
    Mantenimiento mantenimiento; //intefaz

    //Objects
    Dispositivos objdispositivos;
    Celulares objcel;
    Computadores objpc;
    Televisores objtv;

    //views
    vistaBienvenida vistabv;
    vistaComputadores vistapc;
    vistaCelulares vistacel;
    vistaTelevisores vistatv;

    public Controlador() {

        //classes
        objdispositivos = new Dispositivos();
        objcel = new Celulares();
        objtv = new Televisores();
        objpc = new Computadores();

        //views
        vistabv = new vistaBienvenida();
        vistapc = new vistaComputadores();
        vistacel = new vistaCelulares();
        vistatv = new vistaTelevisores();

        //active buttons on views
        vistabv.getRepcelbtn().addActionListener(this);
        vistabv.getRepcompbtn().addActionListener(this);
        vistabv.getReptvbtn().addActionListener(this);
        vistabv.getCerrarbtn().addActionListener(this);
        vistapc.getCerrarbtn().addActionListener(this);
        vistapc.getRegresarbtn().addActionListener(this);
        vistapc.getReparacioncbtn().addActionListener(this);
        vistapc.getReparacionpbtn().addActionListener(this);
        vistacel.getRegresarbtn().addActionListener(this);
        vistacel.getCerrarbtn().addActionListener(this);
        vistacel.getReparacioncbtn().addActionListener(this);
        vistacel.getReparacionpbtn().addActionListener(this);
        vistatv.getRegresarbtn().addActionListener(this);
        vistatv.getReparacioncbtn().addActionListener(this);
        vistatv.getCerrarbtn().addActionListener(this);
        vistatv.getReparacionpbtn().addActionListener(this);

    }

    public void Run() {

        vistabv.setResizable(false);
        vistabv.setLocationRelativeTo(null);
        vistabv.setTitle("Inicio");
        vistabv.setVisible(true);

    }

    public void Exit() {
        System.exit(0);
    }

    //Active views 
    public void activarTelevisores() {

        vistatv.setResizable(false);
        vistatv.setLocationRelativeTo(null);
        vistatv.setTitle("Televisores");
        vistatv.setVisible(true);

    }

    public void activarCelulares() {

        vistacel.setResizable(false);
        vistacel.setLocationRelativeTo(null);
        vistacel.setTitle("Celulares");
        vistacel.setVisible(true);

    }

    public void activarComputadores() {

        vistapc.setResizable(false);
        vistapc.setLocationRelativeTo(null);
        vistapc.setTitle("Computadores");
        vistapc.setVisible(true);

    }

    private Computadores crearComputador() {

        objpc.setMarca(vistapc.getMarcapctxt().getText());
        objpc.setModelo(vistapc.getMarcapctxt().getText());
        objpc.setRam(Integer.parseInt(vistapc.getRampctxt().getText()));
        objpc.setDisco(vistapc.getDiscopctxt().getText());
        objpc.setProcesador(vistapc.getProcesadorpctxt().getText());

        return objpc;
    }

    private Celulares crearCelulares() {

        objcel.setMarca(vistacel.getMarcactxt().getText());
        objcel.setModelo(vistacel.getModelctxt().getText());
        objcel.setRam(Integer.parseInt(vistacel.getRamctxt().getText()));
        objcel.setProcesador(vistacel.getProcesadorctxt().getText());
        objcel.setMPxcamaraF(Integer.parseInt(vistacel.getCamaraftxt().getText()));
        objcel.setMPxcamaraP(Integer.parseInt(vistacel.getCamaraptxt().getText()));

        return objcel;

    }

    private Televisores crearTelevisores() {

        objtv.setMarca(vistatv.getMarcatvtxt().getText());
        objtv.setModelo(vistatv.getModeltvtxt().getText());
        objtv.setTecnologia(vistatv.getTecnologiatvtxt().getText());
        objtv.setTamaño(Double.parseDouble(vistatv.getTamatvtxt().getText()));

        return objtv;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //views conditionals

        if (e.getSource() == vistabv.getRepcelbtn()) {
            activarCelulares();
            vistabv.setVisible(false);
        }
        if (e.getSource() == vistabv.getRepcompbtn()) {
            activarComputadores();
            vistabv.setVisible(false);

        }
        if (e.getSource() == vistabv.getReptvbtn()) {
            activarTelevisores();
            vistabv.setVisible(false);
        }

        if (e.getSource() == vistabv.getCerrarbtn()) {

            this.Exit();
        }

        //buttons on views
        //pc
        if (e.getSource() == vistapc.getReparacioncbtn()) {
            crearComputador();
            vistapc.getTotalpctxt().setText("" + crearComputador().mantenimientoCorrectivo());

        }
        if (e.getSource() == vistapc.getReparacionpbtn()) {
            crearComputador();
            vistapc.getTotalpctxt().setText("" + crearComputador().mantenimientoPreventivo());
        }

        if (e.getSource() == vistapc.getRegresarbtn()) {
            vistapc.setVisible(false);
            vistabv.setResizable(true);
            vistabv.setLocationRelativeTo(null);
            vistabv.setTitle("Inicio");
            vistabv.setVisible(true);
            vistapc.getModelpctxt().setText("");
            vistapc.getMarcapctxt().setText("");
            vistapc.getRampctxt().setText("");
            vistapc.getDiscopctxt().setText("");
            vistapc.getProcesadorpctxt().setText("");
            vistapc.getTotalpctxt().setText("");
        }

        if (e.getSource() == vistapc.getCerrarbtn()) {
            this.Exit();
        }

        //tv
        if (e.getSource() == vistatv.getReparacioncbtn()) {
            crearTelevisores();
            vistatv.getTotaltvtxt().setText("" + crearTelevisores().mantenimientoCorrectivo());
        }
        if (e.getSource() == vistatv.getReparacionpbtn()) {
            crearTelevisores();
            vistatv.getTotaltvtxt().setText("" + crearTelevisores().mantenimientoPreventivo());
        }
        if (e.getSource() == vistatv.getRegresarbtn()) {
            vistatv.setVisible(false);
            vistabv.setResizable(true);
            vistabv.setLocationRelativeTo(null);
            vistabv.setTitle("Inicio");
            vistabv.setVisible(true);
            vistatv.getModeltvtxt().setText("");
            vistatv.getMarcatvtxt().setText("");
            vistatv.getTamatvtxt().setText("");
            vistatv.getTecnologiatvtxt().setText("");
            vistatv.getTotaltvtxt().setText("");
            
        }
        if (e.getSource() == vistatv.getCerrarbtn()) {
            this.Exit();
        }

        //cel
        if (e.getSource() == vistacel.getReparacioncbtn()) {
            crearCelulares();
            vistacel.getTotaltxt().setText("" + crearCelulares().mantenimientoCorrectivo());
        }

        if (e.getSource() == vistacel.getReparacionpbtn()) {
            crearCelulares();
            vistacel.getTotaltxt().setText("" + crearCelulares().mantenimientoPreventivo());
        }
        if (e.getSource() == vistacel.getRegresarbtn()) {
            vistacel.setVisible(false);
            vistabv.setResizable(true);
            vistabv.setLocationRelativeTo(null);
            vistabv.setTitle("Inicio");
            vistabv.setVisible(true);
            vistacel.getModelctxt().setText("");
            vistacel.getMarcactxt().setText("");
            vistacel.getCamaraftxt().setText("");
            vistacel.getCamaraptxt().setText("");
            vistacel.getProcesadorctxt().setText("");
            vistacel.getTotaltxt().setText("");
            vistacel.getRamctxt().setText("");
            vistacel.getDiscoctxt().setText("");
            
            
        }
        if (e.getSource() == vistacel.getCerrarbtn()) {
            this.Exit();
        }

    }

}
