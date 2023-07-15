/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Component;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Style;


/**
 *
 * @author admin
 */
public class HomeForm extends Form {
    
    private Button btnAddUser;
    private Button btnShowUser;
    private Button btnSeconnect;
     private Button btnOblier;
      private Button btnModif;
    
    public HomeForm() {
        super("Menu", BoxLayout.y());
        OnGui();
        addActions();
        // Obtient la barre d'outils de la forme
    Toolbar toolbar = getToolbar();

    // Obtient le composant du titre
    Component titleComponent = toolbar.getTitleComponent();

    // Obtient le style du titre
    Style titleStyle = titleComponent.getStyle();

    // Définit la couleur de premier plan du titre
    titleStyle.setFgColor(0xFF0000); // Remplacez 0xFF0000 par le code couleur de votre choix
    }
    
    private void OnGui() {
        btnAddUser = new Button("Ajouter User");
        btnShowUser = new Button("Afficher User");
        btnSeconnect = new Button("Se Connecter");
         btnOblier = new Button("Envoi Code");
         btnModif = new Button("Modifier User");
        
        this.addAll(new Label("Choisissez une option :"), btnAddUser, btnShowUser, btnSeconnect,btnOblier,btnModif);
    }
    
    private void addActions() {
        btnAddUser.addActionListener((evt) -> {
            new AjoutUserForm(this).show();
        });
        btnShowUser.addActionListener((evt) -> {
            new AfficheUserForm(this).show();
        });
        btnSeconnect.addActionListener((evt) -> {
            new SeConnectUserForm(this).show();
        });
        btnOblier.addActionListener((evt) -> {
            new MotPassOublierForm(this).show();
        });
         btnModif.addActionListener((evt) -> {
            new ModifiUserForm(this).show();
        });

       
    }
    
}
