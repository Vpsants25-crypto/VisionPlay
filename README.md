# Big Play

Player de vídeo Android com interface escura, desenvolvido em Kotlin, Jetpack Compose e AndroidX Media3 (ExoPlayer).

## Recursos
- Abrir vídeos locais pelo seletor de arquivos do Android.
- Reproduzir URLs HTTP/HTTPS diretas para mídia compatível.
- Controles de reprodução, pausa, busca e tela do player fornecidos pelo Media3.
- Interface em português e tema escuro.
- Sem necessidade de permissão ampla para ler todo o armazenamento: o usuário escolhe os arquivos pelo seletor do sistema.

## Requisitos
- Android Studio recente (compatível com Android Gradle Plugin 8.7.3).
- JDK 17.
- Android SDK Platform 35.
- Conexão à internet na primeira compilação para baixar dependências Gradle.

## Abrir e compilar
1. Extraia o projeto e abra a pasta `BigPlay` no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Conecte o telefone com depuração USB ativada ou inicie um emulador.
4. Clique em **Run** para instalar e executar.

Para gerar um APK de depuração, abra o terminal do Android Studio na pasta do projeto e execute com Gradle instalado:

```bash
./gradlew assembleDebug
```

No Windows:

```bat
gradlew.bat assembleDebug
```

O APK será criado em:

`app/build/outputs/apk/debug/app-debug.apk`

O repositório inclui um workflow do GitHub Actions em `.github/workflows/android.yml`. Depois de enviar o projeto ao GitHub, abra a aba **Actions**, execute ou aguarde o workflow **Build Big Play APK** e baixe o artefato `Big-Play-debug-APK` quando a compilação terminar com sucesso.

## Instalar o APK
Copie `app-debug.apk` para o telefone, abra o arquivo e autorize a instalação desta fonte quando o Android solicitar. Também é possível instalar via USB:

```bash
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

## URLs
Use URLs diretas para arquivos de mídia, como MP4, ou streams suportados pelo Media3. Páginas comuns de sites (por exemplo, páginas de vídeo de plataformas) não são necessariamente URLs de mídia e podem não funcionar. Conteúdo protegido por DRM ou formatos específicos podem exigir configuração adicional.

## Observações
Este repositório é o código inicial funcional do player, não uma versão testada em todos os aparelhos. A reprodução depende dos codecs do dispositivo, do formato do arquivo e das permissões/condições do servidor remoto.
