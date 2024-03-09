package com.serhatmerak.chain.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Activity {
    public int id;
    public int timeInMinutes;
    public int durationInMinutes;
    public Date date;
    public String title;
    public String icon;
    public String colorHex;
    public boolean fromTemplate;
    public boolean isDone;
    public String chainId;
    public String habitId;
    public int templateId;
    //public List<Reminder> reminders;
}

/*
late int id;
  late Duration time;
  late Duration duration;
  late DateTime date;
  late String title;
  late String iconPath;
  late Color color;
  late bool fromTemplate;
  late bool isDone;
  late String? chainId;
  late String? habitId;
  late int? templateId;
  late List<ReminderModel> reminders;
 */