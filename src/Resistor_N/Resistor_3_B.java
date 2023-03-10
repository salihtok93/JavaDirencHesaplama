package Resistor_N;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Resistor_3_B extends Base_Resistor {

	public void hesapla(JComboBox<String> a, JComboBox<String> b, JComboBox<String> c, JTextField d) {
		int k1 = a.getSelectedIndex() + 1;
		int k2 = b.getSelectedIndex();
		int k3 = c.getSelectedIndex();
		String birim;
		int snc = 10 * k1 + k2;
		double crp = carpan_bul(k3);
		;

		Double sonuc = snc * crp;

		if (sonuc >= 1000000000) {
			sonuc = sonuc / 1000000000;
			birim = " GΩ";
		} else if (sonuc >= 1000000 && sonuc < 1000000000) {
			sonuc = sonuc / 1000000;
			birim = " MΩ";
		} else if (sonuc >= 1000 && sonuc < 1000000) {
			sonuc = sonuc / 1000;
			birim = " kΩ";
		} else {
			birim = " Ω";
		}
		d.setText("Sonuc : " + sonuc + birim);

	}

}
