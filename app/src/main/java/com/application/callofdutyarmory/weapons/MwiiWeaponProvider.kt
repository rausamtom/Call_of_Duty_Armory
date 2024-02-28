package com.application.callofdutyarmory.weapons

class MwiiWeaponProvider {
    companion object {
        val weaponList = listOf<MwiiWeapon>(
            MwiiWeapon(
                "M4",
                "M4 Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_m4",
                "The flagship rifle of the M4 Platform. This reliable workhorse is a jack-of-all-trades that performs well in most combat scenarios."
            ),
            MwiiWeapon(
                "TAQ-56",
                "Tactique Verte Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_taq56",
                "With a high fire rate and combat flexibility, the TAQ-56 is a full-auto rifle chambered in 5.56x45mm."
            ),
            MwiiWeapon(
                "Kastov 762",
                "Kastovia Platform",
                "Assault Rifle",
                "7.62 Soviet",
                "ar_kastov762",
                "This modern, hard-hitting rifle is the core of the AK Platform. Chambered with large caliber 7.62x39 rounds, a skilled operator will find success with controlled shots."
            ),
            MwiiWeapon(
                "STB 556",
                "Bruen Bullpup Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_stb556",
                "The STB 556 is a closed-bolt rifle built around modularity and accuracy, ideal for mid to long-range fights."
            ),
            MwiiWeapon(
                "Lachmann-556",
                "Lachmann & Meer Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_lachmann556",
                "The Lachmann-556 is the keystone in the Lachmann Meer arsenal. An adaptive 5.56 weapon system that bridges the gap between submachine guns and full-powered rifles."
            ),
            MwiiWeapon(
                "M16",
                "M4 Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_m16",
                "Tuned for mid to long-range engagements, the M16 features a 3-round burst rifle that has increased range and stability."
            ),
            MwiiWeapon(
                "Kastov 545",
                "Kastovia Platform",
                "Assault Rifle",
                "5.45x39mm",
                "ar_kastov545",
                "The Kastov 545 uses intermediate caliber 5.45x39 rounds, allowing for less recoil while maintaining a higher rate of fire."
            ),
            MwiiWeapon(
                "Kastov-74u",
                "Kastovia Platform",
                "Assault Rifle",
                "5.45x39mm",
                "ar_kastov74u",
                "The Kastov-74u is a rifle optimized for short to medium distances. With a shortened receiver and barrels designed for short-range combat, the Kastov-74u gains significant maneuverability at the expense of effective range."
            ),
            MwiiWeapon(
                "M13B",
                "Bruen Ops Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_m13b",
                "The M13B features a short-stroke piston system that allows for a high rate of rife and low recoil."
            ),
            MwiiWeapon(
                "Chimera",
                "Bruen Ops Platform",
                "Assault Rifle",
                ".300 Blackout",
                "ar_chimera",
                "With an integrated suppressor and slow, high-energy subsonic .300 BLK rounds, the Chimera is adept at close-quarters combat."
            ),
            MwiiWeapon(
                "ISO Hemlock",
                "ISO Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_isohemlock",
                "This powerful and enhanced rifle from Expedite Firearms is designed to take both 5.56 and subsonic .300 BLK ammunition, providing battlefield-advantage in any situation."
            ),
            MwiiWeapon(
                "Tempus Razorback",
                "Tidal Recon Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_tempusrazorback",
                "A masterclass in exceptional manufacturing, this Tempus Armament assault rifle features a bullpup design and frame-vibration control, resulting in a smooth and controllable full-auto 5.56 weapon."
            ),
            MwiiWeapon(
                "FR Avancer",
                "Feret Platform",
                "Assault Rifle",
                "5.56 NATO",
                "ar_fravancer",
                "With a blinding fire rate and exceptional maneuverability, in the right hands, this aggressive bullpup rifle can dominate the battlefield."
            ),
            MwiiWeapon(
                "M13C",
                "Bruen Ops Platform",
                "Assault Rifle",
                ".300 Blackout",
                "ar_m13c",
                "The .300 BLK counterpart to the M13B, this full-auto Assault Rifle is versatile and hard-hitting as a main weapon or sniper support secondary."
            ),
            MwiiWeapon(
                "TR-76 Geist",
                "Geist Platform",
                "Assault Rifle",
                "7.62 Soviet",
                "ar_tr76geist",
                "A hard-hitting bullpup assault rifle chambered in 7.62 x 39 mm. Highly modular, this weapon system can be adapted to fit a wide range of tactics and combat scenarios."
            ),
            MwiiWeapon(
                "VEL 46",
                "LMP Platform",
                "Sub Machine Gun",
                "4.6x30mm",
                "smg_vel46",
                "Chambered in 4.6x30mm, the VEL 46 is a maneuverable submachine gun with moderate recoil."
            ),
            MwiiWeapon(
                "MX9",
                "Bruen Bullpup Platform",
                "Sub Machine Gun",
                "9mm Subsonic",
                "smg_mx9",
                "A submachine gun conversion of the rifle receiver, the MX9 submachine gun performs well at close to mid-range. Subsonic ammo hides skulls from the enemy team."
            ),
            MwiiWeapon(
                "Lachmann Sub",
                "Lachmann & Meer Platform",
                "Sub Machine Gun",
                "9mm Parabellum",
                "smg_lachmannsub",
                "The Lachmann Sub's compact, fully automatic 9mm receiver is a masterpiece of stability, mobility and lethality. The modular system is configurable for a variety of covert and close-quarters operations."
            ),
            MwiiWeapon(
                "Vaznev-9K",
                "Kastovia Platform",
                "Sub Machine Gun",
                "9mm Parabellum",
                "smg_vaznev9k",
                "An enhanced and modern version of the AK Platform, the 9mm Vaznev-9K boasts an aggressively high rate of fire and leads the way in short to mid-range engagements."
            ),
            MwiiWeapon(
                "FSS Hurricane",
                "M4 Platform",
                "Sub Machine Gun",
                "5.7x28mm",
                "smg_fsshurricane",
                "The FSS Hurricane sacrifices range and stopping power for increased ammo capacity and enhanced stability."
            ),
            MwiiWeapon(
                "Minibak",
                "Kastovia Platform",
                "Sub Machine Gun",
                "9mm Makarov",
                "smg_minibak",
                "With a high rate of fire, a straight blowback system, and a unique high-capacity magazine, the Minibak shreds in close-quarters combat."
            ),
            MwiiWeapon(
                "PDSW 528",
                "Tactique Defense Platform",
                "Sub Machine Gun",
                "5.7x28mm",
                "smg_pdsw528",
                "Rapid-fire, a compact polymer frame, and high-velocity ammunition make the PDSW 528 a powerhouse for room clearing."
            ),
            MwiiWeapon(
                "Fennec 45",
                "Fennec Platform",
                "Sub Machine Gun",
                ".45 Auto",
                "smg_fennec45",
                "With a blinding fire rate, the Fennec 45 excels at room clearing and holding down the front line. Subsonic Ammo hides kill skulls from the enemy team."
            ),
            MwiiWeapon(
                "BAS-P",
                "Bruen Ops Platform",
                "Sub Machine Gun",
                "9mm Parabellum",
                "smg_basp",
                "An aggressive fire rate and modular frame make the BAS-P perfect for the discerning operator who wants to customize their submachine gun. Subsonic ammo hides kill skulls from the enemy team."
            ),
            MwiiWeapon(
                "ISO 45",
                "ISO Platform",
                "Sub Machine Gun",
                ".45 Auto",
                "smg_iso45",
                "The ISO Platform’s answer to room clearing. This SMG dominates with a high fire rate and the stopping power of .45 Auto rounds."
            ),
            MwiiWeapon(
                "Lachmann Shroud",
                "Lachmann & Meer Platform",
                "Sub Machine Gun",
                "9mm Subsonic",
                "smg_lachmannshroud",
                "This stealthy and lethal 9mm submachine gun features burst and semi-auto fire modes which allow for considerable mobility and stopping power out to the mid-range."
            ),
            MwiiWeapon(
                "ISO 9mm",
                "ISO Platform",
                "Sub Machine Gun",
                "9mm Parabellum",
                "smg_iso9mm",
                "Sweep the battlefield clean with the high fire rate, maneuverability, and exceptional steadiness of this 9mm SMG."
            ),
        )
    }
}