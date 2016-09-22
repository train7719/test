/**
 * @version 14/11/2000 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 * Pacote: org.freedom.telas <BR>
 * Classe: @(#)FLogin.java <BR>
 * 
 * Este arquivo � parte do sistema Freedom-ERP, o Freedom-ERP � um software livre; voc� pode redistribui-lo e/ou <BR>
 * modifica-lo dentro dos termos da Licen�a P�blica Geral GNU como publicada pela Funda��o do Software Livre (FSF); <BR>
 * na vers�o 2 da Licen�a, ou (na sua opni�o) qualquer vers�o. <BR>
 * Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; <BR>
 * sem uma garantia implicita de ADEQUA��O a qualquer MERCADO ou APLICA��O EM PARTICULAR. <BR>
 * Veja a Licen�a P�blica Geral GNU para maiores detalhes. <BR>
 * Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral GNU junto com este programa, se n�o, <BR>
 * escreva para a Funda��o do Software Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA <BR> <BR>
 *
 * Coment�rios para a classe...
 */

package org.freedom.library.swing.frame;

import java.awt.BorderLayout;

import org.freedom.library.swing.component.JLabelPad;
import org.freedom.library.swing.component.JPanelPad;
import org.freedom.library.swing.dialog.FFDialogo;
import org.freedom.library.swing.util.SwingParams;

public class FAtalhos extends FFDialogo {
	private static final long serialVersionUID = 1L;

	private JPanelPad pnAtalhos = new JPanelPad(JPanelPad.TP_JPANEL, new BorderLayout());

	public FAtalhos() {

		super(Aplicativo.telaPrincipal);
		setTitulo("Raccourcis");
		setAtribos(380, 550);

		setToFrameLayout();

		c.add(pnAtalhos);

		JLabelPad lbAtalhos = new JLabelPad();
		StringBuilder atalhos = new StringBuilder();

		atalhos.append("<HTML><BODY>");
		atalhos.append("<UL>");
		atalhos.append("<LI><STRONG>CTRL + N</STRONG> - <EM>Nouveau record</EM>");
		atalhos.append("<LI><STRONG>CTRL + S</STRONG> - <EM>Enregistrer les modifications</EM>");
		atalhos.append("<LI><STRONG>CTRL + D</STRONG> - <EM>Supprimer la fiche</EM>");
		atalhos.append("<LI><STRONG>CTRL + E</STRONG> - <EM>Editer</EM>");
		atalhos.append("<LI><STRONG>CTRL + W</STRONG> - <EM>Annuler les modifications</EM>");
		atalhos.append("<LI><STRONG>CTRL + P</STRONG> - <EM>Imprimer l'Enregistrement</EM>");
		atalhos.append("<LI><STRONG>CTRL + R</STRONG> - <EM>Aper�u avant impression</EM>");
		atalhos.append("<LI><STRONG>CTRL + O</STRONG> - <EM>remarques</EM>");
		atalhos.append("<LI><STRONG>CTRL + I</STRONG> - <EM>Imprimer</EM>");
		atalhos.append("<LI><STRONG>CTRL + P</STRONG> - <EM>aper�u avant impression</EM>");
		atalhos.append("<LI><STRONG>TAB</STRONG> - <EM>Aller au champ suivant</EM>");
		atalhos.append("<LI><STRONG>SHIFT + TAB</STRONG> - <EM>Retour au champ pr�c�dent</EM>");
		atalhos.append("<LI><STRONG>SHIFT + F4</STRONG> - <EM>Fermer l'�cran</EM>");
		atalhos.append("<LI><STRONG>Espace</STRONG> - <EM>Appuyez sur un bouton</EM>");
		atalhos.append("<LI><STRONG>CTRL + PAGE UP</STRONG> - <EM>Aller � la premi�re Enregistrement</EM>");
		atalhos.append("<LI><STRONG>PAGE UP</STRONG> - <EM>Aller � l'enregistrement pr�c�dentee</EM>");
		atalhos.append("<LI><STRONG>PAGE DOWN</STRONG> - <EM>Aller au Document suivant</EM>");
		atalhos.append("<LI><STRONG>CTRL + PAGE DOWN</STRONG> - <EM>aller � la fiche Derni�re</EM>");
		atalhos.append("<LI><STRONG>F1</STRONG> - <EM>Raccourcis</EM>");
		atalhos.append("<LI><STRONG>F2</STRONG> - <EM>Recherche</EM>");
		atalhos.append("<LI><STRONG>F3</STRONG> - <EM>Trouver similaire</EM>");
		atalhos.append("<LI><STRONG>F4</STRONG> - <EM>Remplissez le budget</EM>");
		atalhos.append("<LI><STRONG>F4</STRONG> - <EM>Fermer l'Achat</EM>");
		atalhos.append("<LI><STRONG>F4</STRONG> - <EM>Fermer le Vente</EM>");
		atalhos.append("<LI><STRONG>F5</STRONG> - <EM>Consulter les paiements</EM>");
		atalhos.append("<LI><STRONG>F6</STRONG> - <EM>Ouvrir l'�cran d'enregistrement</EM>");
		atalhos.append("<LI><STRONG>ESC</STRONG> - <EM>Fermer la fen�tre </EM>");
		atalhos.append("</UL>");
		atalhos.append("</BODY>");
		atalhos.append("</HTML>");

		lbAtalhos.setText(atalhos.toString());
		lbAtalhos.setFont(SwingParams.getFontbold());

		pnAtalhos.add(lbAtalhos);

	}
}
