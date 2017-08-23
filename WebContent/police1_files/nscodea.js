

var marqueewidth="460px"
var marqueeheight="20px"
var marqueespeed=2
var marqueebgcolor="#ffffff"
var pauseit=1
var onetime="yes"
var oneint=35

var marqueecontent='<nobr><img src=http://codeamber.com/smlogo.jpg WIDTH=40 HEIGHT=20 align=absbottom> -- <a href=http://www.codeamber.org/toolbar.php?tck1 target="_blank" style="text-decoration:none;"><font face=verdana size=2 color="#000000">Get the Free Code Amber Toolbar and Newsletter - Click Here.</a> -- <a href=http://codeamber.com/gakredir.html target=_new  style="color:maroon; text-decoration:none;"> <img src=http://codeamber.com/aimages/mugshot3.jpg border=0 width=20 height=20 hspace=5 align=absbottom><b> Instant Arrest Records and Background Checks  -- Click Here to Search Free <img src=http://codeamber.com/aimages/mugshot2.jpg border=0 width=20 height=20 hspace=5 align=absbottom></a></b> -- <a href=http://codeamber.com/toolbar.php?tck2 target="_blank" style="color:#000000; text-decoration:none;"><font face=verdana size=2 color="#000000">Code Amber Missing Persons & AMBER Alerts are all available <b><u>Here</u></b></a> --  Follow us on <a href=http://twitter.com/codeamber target="_blank" ><img src=http://codeamber.com/images/twsmall.bmp border=0 width=20 height=20 hspace=5 align=absbottom></a><a href=https://www.facebook.com/pages/Code-Amber-Missing-Persons-Reporting/481853438524446 target="_blank" ><img src=http://codeamber.com/images/fbsmall.bmp border=0 width=20 height=20 hspace=5 align=absbottom></a> -- <a href=http://codeamber.com/index-2.php?endticker target=_new  style="color:#000000; text-decoration:none;"> <b> Click Here to Add This Ticker to Your Web Site. </b></a> --  <a href=http://codeamber.com/gakredir1.html target=_new  style="color:blue; text-decoration:none;"><b>Want to make $20 in 8 minutes online? -- Click Here</a></b> -- <a href=http://codeamber.txtyourex.hop.clickbank.net/\?tid=caticktxt target=_new style="color:black; text-decoration:underline; font-weight:bold;">Want Your Ex Back\? Here\'s How</a> </font></nobr>'

////NO NEED TO EDIT BELOW THIS LINE////////////
//marqueespeed=(document.all)? marqueespeed : Math.max(1, marqueespeed-1) //slow speed down by 1 for NS
var copyspeed=marqueespeed
var pausespeed=(pauseit==0)? copyspeed: 0
var iedom=document.all||document.getElementById
if (iedom) {
document.write('<span id="temp" style="visibility:hidden;position:absolute;top:-100px;left:-9000px">'+marqueecontent+'</span>')
var actualwidth=''
var cross_marquee, ns_marquee
}

function populate(){
if (iedom){
cross_marquee=document.getElementById? document.getElementById("iemarquee") : document.all.iemarquee
cross_marquee.style.left=parseInt(marqueewidth)+8+"px"
cross_marquee.innerHTML=marqueecontent
actualwidth=document.all? temp.offsetWidth : document.getElementById("temp").offsetWidth
}
else if (document.layers){
ns_marquee=document.ns_marquee.document.ns_marquee2
ns_marquee.left=parseInt(marqueewidth)+8
ns_marquee.document.write(marqueecontent)
ns_marquee.document.close()
actualwidth=ns_marquee.document.width
}
lefttime=setInterval("scrollmarquee()",oneint)
}

if ((navigator.appName == "Microsoft Internet Explorer") && (parseInt(navigator.appVersion) >= 4)) 	{
window.onfocus=populate
    		}
	    else {
window.onload=populate
		}


function scrollmarquee(){
oneint=0
if (iedom){
if (parseInt(cross_marquee.style.left)>(actualwidth*(-1)+8))
cross_marquee.style.left=parseInt(cross_marquee.style.left)-copyspeed+"px"
else
cross_marquee.style.left=parseInt(marqueewidth)+8+"px"

}
else if (document.layers){
if (ns_marquee.left>(actualwidth*(-1)+8))
ns_marquee.left-=copyspeed
else
ns_marquee.left=parseInt(marqueewidth)+8
}
}

if (iedom||document.layers){
with (document){
document.write('<table border="0" cellspacing="0" cellpadding="0"><td>')
if (iedom){
write('<div style="position:relative;width:'+marqueewidth+';height:'+marqueeheight+';overflow:hidden">')
write('<div style="position:absolute;width:'+marqueewidth+';height:'+marqueeheight+';background-color:'+marqueebgcolor+'" onMouseover="copyspeed=pausespeed" onMouseout="copyspeed=marqueespeed">')
write('<div id="iemarquee" style="position:absolute;left:0px;top:0px"></div>')
write('</div></div>')
}
else if (document.layers){
write('<ilayer width='+marqueewidth+' height='+marqueeheight+' name="ns_marquee" bgColor='+marqueebgcolor+'>')
write('<layer name="ns_marquee2" left=0 top=0 onMouseover="copyspeed=pausespeed" onMouseout="copyspeed=marqueespeed"></layer>')
write('</ilayer>')
}
}
document.write('</td></table>')

}
// end -->
