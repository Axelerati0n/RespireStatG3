package vue;

import java.util.HashMap;

import javax.swing.table.AbstractTableModel;

import controleur.ConvertCSV;

public class TableauStat3 extends AbstractTableModel{
	private static final long serialVersionUID = 1L;
	//TODO Créer les attributs
	private final String[] entetes = { "D�partement", "NO2", "PM10", "PM25" };	
	private final HashMap<String, Double> moyennedepartementNO2;
	private final HashMap<String, Double> moyennedepartementPM10;
	private final HashMap<String, Double> moyennedepartementPM25;
	//TODO Créer le constructeur
	public TableauStat3(HashMap<String, Double> moyennedepartementNO2, HashMap<String, Double>moyennedepartementPM10, HashMap<String, Double> moyennedepartementPM25) {
		this.moyennedepartementNO2 = moyennedepartementNO2;
		this.moyennedepartementPM10 = moyennedepartementPM10;
		this.moyennedepartementPM25 = moyennedepartementPM25;
	}
	@Override
	public int getColumnCount() {
		// TODO Compléter getColumnCount
		return entetes.length;
	}
	@Override
	public String getColumnName(int columnIndex) {
		// TODO Compléter getColumnName
		return entetes[columnIndex];
	}

	@Override
	public int getRowCount() {
		// TODO Compléter getRowCount
		return ConvertCSV.listeDepartements.size();
	}
	

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Compléter getValueAt
		switch (columnIndex) {
		case 0:
			return ConvertCSV.listeDepartements.get(rowIndex);
			
		case 1:
			
			return moyennedepartementNO2.get(ConvertCSV.listeDepartements.get(rowIndex));

		case 2:
			
			return moyennedepartementPM10.get(ConvertCSV.listeDepartements.get(rowIndex));

		case 3:
			
			return moyennedepartementPM25.get(ConvertCSV.listeDepartements.get(rowIndex));

		default:
			throw new IllegalArgumentException();
		}
		
	}
}
