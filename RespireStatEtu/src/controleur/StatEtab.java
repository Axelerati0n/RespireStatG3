package controleur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Etablissement;

/**
 * Calculs statistiques sur les données de pollution des 
 * polluants N02, PM10 et PM25
 * @author Flavie Tonon
 *
 */
public class StatEtab {

	
	/**
	 * Calcule la moyenne du polluant N02 pour un département donné
	 * @param l La liste des établissements
	 * @param dpt Le nom du département
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantNO2Dpt(ArrayList<Etablissement> l, String dpt, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy+=e.getPollutionNO2(annee);
			}
		}
		return moy/l.size();
	}

	/**
	 * Calcule la moyenne du polluant PM10 pour un département donné
	 * @param l La liste des établissements
	 * @param dpt Le nom du département
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM10Dpt(ArrayList<Etablissement> l, String dpt, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}

	/**
	 * Calcule la moyenne du polluant PM25 pour un département donné
	 * @param l La liste des établissements
	 * @param dpt Le nom du département
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM25Dpt(ArrayList<Etablissement> l, String dpt, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(dpt)) {
				moy+=e.getPollutionPM25(annee);
			}
		}
		return moy/l.size();
	}
	

	/**
	 * Calcule la moyenne du polluant N02 pour une ville donnée
	 * @param l La liste des établissements
	 * @param ville Le nom de la ville
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantNO2Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionNO2(annee);
			}
		}
		return moy/l.size();
	}

	/**
	 * Calcule la moyenne du polluant PM10 pour une ville donnée
	 * @param l La liste des établissements
	 * @param ville Le nom de la ville
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM10Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}
	
	/**
	 * Calcule la moyenne du polluant PM25 pour une ville donnée
	 * @param l La liste des établissements
	 * @param ville Le nom de la ville
	 * @param annee L'année de récolte des données demandée
	 * @return la moyenne de pollution
	 * Flavie Tonon
	 */
	public static double getMoyennePolluantPM25Ville(ArrayList<Etablissement> l, String ville, int annee) {
		double moy = 0;
		for(Etablissement e : l) {//for each
			if(e.getLieu().getVille().equals(ville)) {
				moy+=e.getPollutionPM25(annee);
			}
		}
		return moy/l.size();
	}
	
	/**
	 * Trouve l'établissement le plus polluant au NO2 sur une année
	 * @param l La liste des établissements
	 * @param annee L'année de récolte des données demandée
	 * @return L'établissement le plus polluant au N02
	 * Flavie Tonon
	 */
	public static Etablissement getPlusPolluantNO2(ArrayList<Etablissement> l, int annee) {		
		var L1 = l.get(0).getPollutionNO2(annee);
		int i = 0;
		int j = 0;
		
		for(Etablissement e : l) {
			
			if(e.getPollutionNO2(annee)>L1){
				L1=e.getPollutionNO2(annee);
				j=i;
				
			}
			i++;
			
		}
		//System.out.println("NO2 : "+L1+" "+annee+" "+" "+j);
		return l.get(j);
	}
		
		
		
		
	
	/**
	 * Trouve l'établissement le plus polluant au PM10 sur une année
	 * @param l La liste des établissements
	 * @param annee L'année de récolte des données demandée
	 * @return L'établissement le plus polluant au PM10
	 * Flavie Tonon
	 */
	public static Etablissement getPlusPolluantPM10(ArrayList<Etablissement> l, int annee) {
		double L1 = l.get(0).getPollutionPM10(annee);
		int i = 0;
		int j = 0;
		
		for(Etablissement e : l) {
			
			if(e.getPollutionPM10(annee)>L1){
				L1=e.getPollutionPM10(annee);
				j=i;
				
				
			}
			i++;
			
		}
		//System.out.println("PM10 : "+L1+" "+annee+" "+" "+j);
		return l.get(j);
		
	}
	/**
	 * Trouve l'établissement le plus polluant au PM25 sur une année
	 * @param l La liste des établissements
	 * @param annee L'année de récolte des données demandée
	 * @return L'établissement le plus polluant au PM25
	 * Flavie Tonon
	 */
	public static Etablissement getPlusPolluantPM25(ArrayList<Etablissement> l, int annee) {
		double L1 = l.get(0).getPollutionPM25(annee);
		int i = 0;
		int j = 0;
		
		for(Etablissement e : l) {
			
			if(e.getPollutionPM25(annee)>L1){
				L1=e.getPollutionPM25(annee);
				j=i;
				
			}
			i++;
			
		}
		//System.out.println("PM25 : "+L1+" "+annee+" "+" "+j+" "+l.get(j).getIdentifiant()+" "+l.get(j));
		return l.get(j);
	}
	
	
	public static double getMoyennePolluantNO2Departement(ArrayList<Etablissement> l, String departement, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(departement)) {
				moy+=e.getPollutionNO2(annee);
			}
		}
		return moy/l.size();
	}
	
	public static double getMoyennePolluantPM10Departement(ArrayList<Etablissement> l, String departement, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(departement)) {
				moy+=e.getPollutionPM10(annee);
			}
		}
		return moy/l.size();
	}
	public static double getMoyennePolluantPM25Departement(ArrayList<Etablissement> l, String departement, int annee) {
		double moy = 0;
		for(Etablissement e : l) {
			if(e.getLieu().getDepartement().equals(departement)) {
				moy+=e.getPollutionPM25(annee);
			}
		}
		return moy/l.size();
	}
	
	public static double getTauxDeVariationNO2Departement(ArrayList<Etablissement> l, String departement, int annee) {
		
		double vf = getMoyennePolluantNO2Departement(l,departement ,annee+1);
		double vi = getMoyennePolluantNO2Departement(l,departement ,annee);
		double tv = 0;
		
		tv = ((vi-vf)/vi)*100;
		
		
		
		System.out.println("NO2 -- "+departement+"----"+tv+"------"+annee+"-"+annee+1);
		
		return tv;
	}
	public static double getTauxDeVariationPM10Departement(ArrayList<Etablissement> l, String departement, int annee) {
		
		double vf = getMoyennePolluantPM10Departement(l,departement ,annee+1);
		double vi = getMoyennePolluantPM10Departement(l,departement ,annee);
		double tv = 0;
		
		tv = ((vi-vf)/vi)*100;
		
		
		
		System.out.println("PM10 -- "+departement+"----"+tv+"------"+annee+"-"+annee+1);
		
		return tv;
	}
	public static double getTauxDeVariationPM25Departement(ArrayList<Etablissement> l, String departement, int annee) {
		
		double vf = getMoyennePolluantPM25Departement(l,departement ,annee+1);
		double vi = getMoyennePolluantPM25Departement(l,departement ,annee);
		double tv = 0;
		
		tv = ((vi-vf)/vi)*100;
		
		
		
		System.out.println("PM25 -- "+departement+"----"+tv+"------"+annee+"-"+annee+1);
		
		return tv;
	}	
}
