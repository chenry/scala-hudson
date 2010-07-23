package com.gfs.hudson.tools

import java.util._

import org.apache.http._
import org.apache.http.message._
import org.apache.http.client._
import org.apache.http.impl.client._
import org.apache.http.client.methods._
import org.apache.http.client.entity._


object HttpController {
  val URL_CONFIG_SUFFIX = "/job/XXXYYYZZZ/config.xml";
  def getConfig(hudsonURL : String, projectName: String) : String = {
       val client = new DefaultHttpClient()
       val url = hudsonURL + URL_CONFIG_SUFFIX.replace("XXXYYYZZZ", projectName)
       println("Url to lookup " + url)
       var httpGet = new HttpGet(url)

       var handler = new BasicResponseHandler()
       var responseBody = client.execute(httpGet, handler)
       client.getConnectionManager().shutdown()
       return responseBody;
  }

  def copyJob(hudsonURL: String, fromProjectName: String, toProjectName: String) : Unit = {
       val client = new DefaultHttpClient()
       val url = hudsonURL + "/createItem"
       var formParms : List[NameValuePair] = new ArrayList[NameValuePair]

       formParms.add(new BasicNameValuePair("mode", "copy"))
       formParms.add(new BasicNameValuePair("from",fromProjectName)) 
       formParms.add(new BasicNameValuePair("name", toProjectName))

       var entity = new UrlEncodedFormEntity(formParms, "UTF-8")

       var httpPost = new HttpPost(url)
       httpPost.setEntity(entity)
       client.execute(httpPost)
  }
}
