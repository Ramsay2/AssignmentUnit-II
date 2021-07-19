package com.example.unit_ii_sprint_4;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("date")
	private int date;

	@SerializedName("death")
	private int death;

	@SerializedName("totalTestResultsIncrease")
	private int totalTestResultsIncrease;

	@SerializedName("pending")
	private int pending;

	@SerializedName("hospitalizedCurrently")
	private int hospitalizedCurrently;

	@SerializedName("hospitalizedIncrease")
	private int hospitalizedIncrease;

	@SerializedName("states")
	private int states;

	@SerializedName("onVentilatorCumulative")
	private int onVentilatorCumulative;

	@SerializedName("hospitalized")
	private int hospitalized;

	@SerializedName("negative")
	private int negative;

	@SerializedName("total")
	private int total;

	@SerializedName("hospitalizedCumulative")
	private int hospitalizedCumulative;

	@SerializedName("inIcuCumulative")
	private int inIcuCumulative;

	@SerializedName("negativeIncrease")
	private int negativeIncrease;

	@SerializedName("positiveIncrease")
	private int positiveIncrease;

	@SerializedName("deathIncrease")
	private int deathIncrease;

	@SerializedName("totalTestResults")
	private int totalTestResults;

	@SerializedName("inIcuCurrently")
	private int inIcuCurrently;

	@SerializedName("dateChecked")
	private String dateChecked;

	@SerializedName("onVentilatorCurrently")
	private int onVentilatorCurrently;

	@SerializedName("positive")
	private int positive;

	@SerializedName("posNeg")
	private int posNeg;

	@SerializedName("lastModified")
	private String lastModified;

	@SerializedName("hash")
	private String hash;

	public void setDate(int date){
		this.date = date;
	}

	public int getDate(){
		return date;
	}

	public void setDeath(int death){
		this.death = death;
	}

	public int getDeath(){
		return death;
	}

	public void setTotalTestResultsIncrease(int totalTestResultsIncrease){
		this.totalTestResultsIncrease = totalTestResultsIncrease;
	}

	public int getTotalTestResultsIncrease(){
		return totalTestResultsIncrease;
	}

	public void setPending(int pending){
		this.pending = pending;
	}

	public int getPending(){
		return pending;
	}

	public void setHospitalizedCurrently(int hospitalizedCurrently){
		this.hospitalizedCurrently = hospitalizedCurrently;
	}

	public int getHospitalizedCurrently(){
		return hospitalizedCurrently;
	}

	public void setHospitalizedIncrease(int hospitalizedIncrease){
		this.hospitalizedIncrease = hospitalizedIncrease;
	}

	public int getHospitalizedIncrease(){
		return hospitalizedIncrease;
	}

	public void setStates(int states){
		this.states = states;
	}

	public int getStates(){
		return states;
	}

	public void setOnVentilatorCumulative(int onVentilatorCumulative){
		this.onVentilatorCumulative = onVentilatorCumulative;
	}

	public int getOnVentilatorCumulative(){
		return onVentilatorCumulative;
	}

	public void setHospitalized(int hospitalized){
		this.hospitalized = hospitalized;
	}

	public int getHospitalized(){
		return hospitalized;
	}

	public void setNegative(int negative){
		this.negative = negative;
	}

	public int getNegative(){
		return negative;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setHospitalizedCumulative(int hospitalizedCumulative){
		this.hospitalizedCumulative = hospitalizedCumulative;
	}

	public int getHospitalizedCumulative(){
		return hospitalizedCumulative;
	}

	public void setInIcuCumulative(int inIcuCumulative){
		this.inIcuCumulative = inIcuCumulative;
	}

	public int getInIcuCumulative(){
		return inIcuCumulative;
	}

	public void setNegativeIncrease(int negativeIncrease){
		this.negativeIncrease = negativeIncrease;
	}

	public int getNegativeIncrease(){
		return negativeIncrease;
	}

	public void setPositiveIncrease(int positiveIncrease){
		this.positiveIncrease = positiveIncrease;
	}

	public int getPositiveIncrease(){
		return positiveIncrease;
	}

	public void setDeathIncrease(int deathIncrease){
		this.deathIncrease = deathIncrease;
	}

	public int getDeathIncrease(){
		return deathIncrease;
	}

	public void setTotalTestResults(int totalTestResults){
		this.totalTestResults = totalTestResults;
	}

	public int getTotalTestResults(){
		return totalTestResults;
	}

	public void setInIcuCurrently(int inIcuCurrently){
		this.inIcuCurrently = inIcuCurrently;
	}

	public int getInIcuCurrently(){
		return inIcuCurrently;
	}

	public void setDateChecked(String dateChecked){
		this.dateChecked = dateChecked;
	}

	public String getDateChecked(){
		return dateChecked;
	}

	public void setOnVentilatorCurrently(int onVentilatorCurrently){
		this.onVentilatorCurrently = onVentilatorCurrently;
	}

	public int getOnVentilatorCurrently(){
		return onVentilatorCurrently;
	}

	public void setPositive(int positive){
		this.positive = positive;
	}

	public int getPositive(){
		return positive;
	}

	public void setPosNeg(int posNeg){
		this.posNeg = posNeg;
	}

	public int getPosNeg(){
		return posNeg;
	}

	public void setLastModified(String lastModified){
		this.lastModified = lastModified;
	}

	public String getLastModified(){
		return lastModified;
	}

	public void setHash(String hash){
		this.hash = hash;
	}

	public String getHash(){
		return hash;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"date = '" + date + '\'' + 
			",death = '" + death + '\'' + 
			",totalTestResultsIncrease = '" + totalTestResultsIncrease + '\'' + 
			",pending = '" + pending + '\'' + 
			",hospitalizedCurrently = '" + hospitalizedCurrently + '\'' + 
			",hospitalizedIncrease = '" + hospitalizedIncrease + '\'' + 
			",states = '" + states + '\'' + 
			",onVentilatorCumulative = '" + onVentilatorCumulative + '\'' + 
			",hospitalized = '" + hospitalized + '\'' + 
			",negative = '" + negative + '\'' + 
			",total = '" + total + '\'' + 
			",hospitalizedCumulative = '" + hospitalizedCumulative + '\'' + 
			",inIcuCumulative = '" + inIcuCumulative + '\'' + 
			",negativeIncrease = '" + negativeIncrease + '\'' + 
			",positiveIncrease = '" + positiveIncrease + '\'' + 
			",deathIncrease = '" + deathIncrease + '\'' + 
			",totalTestResults = '" + totalTestResults + '\'' + 
			",inIcuCurrently = '" + inIcuCurrently + '\'' + 
			",dateChecked = '" + dateChecked + '\'' + 
			",onVentilatorCurrently = '" + onVentilatorCurrently + '\'' + 
			",positive = '" + positive + '\'' + 
			",posNeg = '" + posNeg + '\'' + 
			",lastModified = '" + lastModified + '\'' + 
			",hash = '" + hash + '\'' + 
			"}";
		}
}