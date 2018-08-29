/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.peerinstruction.principal;

import br.edu.ifpb.dac.peerinstruction.Pessoa;
import br.edu.ifpb.dac.peerinstruction.repositorio.Repositorio;
import br.edu.ifpb.dac.peerinstruction.repositorio.RepositorioSGBD;
import br.edu.ifpb.dac.peerinstruction.repositorio.RepositorioXml;

/**
 *
 * @author jose2
 */
public class Principal {
    public static void main(String[] args) {
        //cria um objeto do tipo Pessoa
          Pessoa pessoa = new Pessoa("josé", "222.444.222-43",21);
          // Salva o objeto no SGBDR
    Repositorio daoSGBD = new RepositorioSGBD();
    daoSGBD.save(pessoa);
    // Salva o objeto em formato XML
        Repositorio daoXml = new RepositorioXml();
        daoXml.save(pessoa);
    }
     
}
