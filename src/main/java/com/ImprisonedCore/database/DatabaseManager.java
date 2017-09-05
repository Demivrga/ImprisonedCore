package com.ImprisonedCore.database;

import java.util.UUID;

import com.ImprisonedMongo.database.MongoManager;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

public class DatabaseManager {

	public static DBCollection dbc = MongoManager.getDB().getCollection("Players");

	public static void storePlayer(UUID uuid, String name, String gang, String gangrank, String rank, int vip, double money) {
		DBObject obj = new BasicDBObject("uuid", uuid);
		obj.put("name", name);
		obj.put("gang", gang);
		obj.put("gankrank", gangrank);
		obj.put("rank", rank);
		obj.put("vip", vip);
		obj.put("money", money);
		dbc.insert(obj);
	}
	
	public static long TotalUsers() {
		
		long xyz = dbc.count();
		return xyz;
		
	}

	public static DBObject findPlayer(UUID uuid) {
		DBObject search = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(search);

		if (found == null) {
			return null;
		}
		return found;
	}

	public static String PlayerName(UUID uuid) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);

		if (found == null) {
			return null;
		}

		String name = (String) found.get("name");
		return name;
	}
	
	public static void updatePlayerName(UUID uuid, String name) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		if (found == null) {
			return;
		}
		BasicDBObject set = new BasicDBObject("$set", r);
		set.append("$set", new BasicDBObject("name", name));
		dbc.update(found, set);
	}

	public static String PlayerRank(UUID uuid) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);

		if (found == null) {
			return null;
		}

		String rank = (String) found.get("rank");
		return rank;
	}
	
	public static void updatePlayerRank(UUID uuid, String rank) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		if (found == null) {
			return;
		}
		BasicDBObject set = new BasicDBObject("$set", r);
		set.append("$set", new BasicDBObject("rank", rank));
		dbc.update(found, set);
	}

	public static long PlayerMoney(UUID uuid) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		
		long money = (Long)found.get("money");
		return money;
	}
	
	public static void updatePlayerMoney(UUID uuid, long money) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		if (found == null) {
			return;
		}
		BasicDBObject set = new BasicDBObject("$set", r);
		set.append("$set", new BasicDBObject("money", money));
		dbc.update(found, set);
	}
	
	public static String PlayerGang(UUID uuid) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		
		if (found == null) {
			return null;
		}
		
		String gang = (String) found.get("gang");
		return gang;
	}
	
	public static String PlayerGangRank(UUID uuid) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		
		if (found == null) {
			return null;
		}
		
		String gang = (String) found.get("gangrank");
		return gang;
	}
	
	public static void updatePlayerGang(UUID uuid, String gang) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		if (found == null) {
			return;
		}
		BasicDBObject set = new BasicDBObject("$set", r);
		set.append("$set", new BasicDBObject("gang", gang));
		dbc.update(found, set);
	}
	
	public static void updatePlayerGangRank(UUID uuid, String gangrank) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		if (found == null) {
			return;
		}
		BasicDBObject set = new BasicDBObject("$set", r);
		set.append("$set", new BasicDBObject("gangrank", gangrank));
		dbc.update(found, set);
	}
	
	
	public static int PlayerVIP(UUID uuid) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		
		int vip = (Integer) found.get("vip");
		return vip;
	}
	
	public static void updatePlayerVIP(UUID uuid, int vip) {
		DBObject r = new BasicDBObject("uuid", uuid);
		DBObject found = dbc.findOne(r);
		if (found == null) {
			return;
		}
		BasicDBObject set = new BasicDBObject("$set", r);
		set.append("$set", new BasicDBObject("vip", vip));
		dbc.update(found, set);
	}

}
