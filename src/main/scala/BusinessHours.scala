package net.dappy.utils

import java.time._

object BusinessHours {

  //
  // DISCLAIMER : Use at your own risk....
  //
  // TODO - put this outside into a config file or a db for adjustability

  val business_hours_start : LocalTime = LocalTime.parse("07:00:00")
  val business_hours_end   : LocalTime = LocalTime.parse("17:00:00")

  def is_it_outside_business_hours(questionableTime: LocalTime) : Boolean = {
    questionableTime.isBefore(business_hours_start) ||  questionableTime.isAfter(business_hours_end)
  }

}


