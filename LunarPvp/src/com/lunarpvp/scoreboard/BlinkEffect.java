package com.lunarpvp.scoreboard;

public class BlinkEffect {
	
	private int i = 1;
	private String texto = "§b§lLunar§f§lPvP";
	public BlinkEffect(){
		
	}
	
	public void next(){
		if (i == 1){
			texto = "§f§lLunar§b§lPvP";
		}
		if (i == 2){
			texto = "§f§lLunar§f§lPvP";
		}
		if (i == 3){
			texto = "§b§lLunar§b§lPvP";
		}
		if (i == 4){
			texto = "§b§lLunar§f§lPvP";
		}
		if (i == 5){
			texto = "§b§lPvP§f§lLunar";
		}
		if (i == 6){
			texto = "§f§lLunar§f§lPvP";
		}
		if (i == 7){
			texto = "§b§lLunar§f§lPvP";
		}
		if (i == 8){
			texto = "§f§k@@@@@@@@@@@@";
		}
		if (i == 9){
			texto = "§b§lLunar§f§lPvP";
		}
		if (i == 10) {
			texto = "§b§lLunar§b§lPvP";
		}
		if (i == 11) {
			texto = "§f§lLunar§b§lPvP";
		}
		if (i == 12) {
			texto = "§b§lLunar§f§lPvP";
		}
		if (i == 13) {
			texto = "§kkkkkkkkkkkkkkkk";
		}
		if (i == 14) {
			texto = "§b§lKit§f§lPvP";
		}
		if (i == 15) {
			texto = "§b§l§kL§r§b§lunar§f§lPvP";
		}
		if (i == 16) {
			texto = "§b§lLunar§f§lPvP";
		}
		if (i == 17) {
			texto = "§f§lLunar§f§lPvP";
		}
		if (i == 18) {
			texto = "§f§lLunar§f§lPvP";
		}
		if (i == 18) {
			texto = "§b§lLunar§b§lPvP";
		}
		if (i == 19){
			texto = "§b§lLunar§f§lPvP";
			i = 0;
		}
		i++;
		
		
	}
	public String getText(){
		return texto;
	}

}
