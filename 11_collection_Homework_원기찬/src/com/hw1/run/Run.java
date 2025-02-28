package com.hw1.run;

import java.util.ArrayList;
import com.hw1.model.dto.Friend;

public class Run {
	public static void main(String[] args) {
		ArrayList<Friend> friendArr = new ArrayList<>();

		friendArr.add(new Friend("짱구"));
		friendArr.add(new Friend("철수"));
		friendArr.add(new Friend("유리"));
		friendArr.add(new Friend("훈이"));
		friendArr.add(new Friend("맹구"));

		new Friend().pickLeader(friendArr);
	}
}