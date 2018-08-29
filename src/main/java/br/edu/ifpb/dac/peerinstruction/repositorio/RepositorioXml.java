/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.peerinstruction.repositorio;

import br.edu.ifpb.dac.peerinstruction.Pessoa;
import com.thoughtworks.xstream.XStream;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose2
 */
public class RepositorioXml implements Repositorio {

    @Override
    public void save(Pessoa pessoa) {
        XStream xstream = new XStream();
        String xmlPessoa = xstream.toXML(pessoa);
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("pessoas.xml"));
            writer.write(xmlPessoa); //salva fisicamente
             writer.close();
             
        } catch (IOException ex) {
            Logger.getLogger(RepositorioXml.class.getName()).log(Level.SEVERE, null, ex);
      
       
    }

}
}
