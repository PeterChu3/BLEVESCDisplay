# VESC Dashboard

## Background & Explanation

![Mini Bike View](https://github.com/PeterChu3/BLEVESCDisplay/blob/master/Docs/Images/OsaTrampa.jpg?raw=true)

I have a friend, Osa All, who rides a trampa with a burner android phone to serve as a dashboard for his ride. He uses the stock VESC tool app for live speed and battery data. In my opinion the stock VESC-Tool telemtry page is rather cluttered for riding. According to Osa, speed and battery info at a glance is all he really needs and this app provides that in a easier to read way.

#### Important links where I got information.

The commands for VESC data
https://github.com/vedderb/bldc/blob/805006f03e486506145e6faa1f334d47fe9875d8/comm/commands.c

BLE/Gatt overview
https://learn.adafruit.com/introducing-the-adafruit-bluefruit-le-uart-friend/gatt-service-details

Forum post for VESC packets
http://vedder.se/2015/10/communicating-with-the-vesc-using-uart/

## Telemtry Packets & VESC information

![Red Light view](https://github.com/chuy4ever/RedLight/blob/main/redLight.gif?raw=true)
