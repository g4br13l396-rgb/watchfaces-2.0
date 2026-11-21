# Razor Tread – Watch Face (Wear OS, Watch Face Format)
Watchface personale per Xiaomi Watch 2 Pro. Sfondo: immagine "Razor Tread Series" (uso personale).

## Build
Push su `main` → GitHub Actions → scarica l'APK da Actions > ultimo run > Artifacts.

## Installazione sull'orologio
1. Orologio: Impostazioni > Info > Versione software, tocca 7 volte "Numero build".
2. Impostazioni > Opzioni sviluppatore: attiva "Debug ADB" e "Debug tramite Wi-Fi".
3. PC: `adb pair IP:PORTA_PAIRING`, poi `adb connect IP:PORTA`
4. `adb install app-debug.apk`
5. Sull'orologio: tieni premuto il quadrante > scorri > scegli "Razor Tread".

Personalizza (tieni premuto > Personalizza): complicazioni Passi e Battito.
