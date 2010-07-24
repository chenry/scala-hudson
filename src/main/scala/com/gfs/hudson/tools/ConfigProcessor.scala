package com.gfs.hudson.tools

import scala.xml._

object ConfigProcessor {
  def transformConfig(xml : String, branchName: String) : String = {
       var finalConfigXml = xml.replace("trunk", "branches/" + branchName)
       return finalConfigXml;
  }

}
