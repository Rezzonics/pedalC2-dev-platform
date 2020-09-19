# pedalc2-dev-platform
Pedal Development Platform for Hardkernel Odroid-C2.
This project is based on zeus branch of Yocto project. See instructions on Yocto project to install zeus branch:
https://www.yoctoproject.org/docs/1.8/yocto-project-qs/yocto-project-qs.html
After installing the required packages for your Linux OS distribution install poky:
```Shell
$ mkdir yocto-odroid
$ cd yocto-odroid
$ git clone http://git.yoctoproject.org/git/poky
$ cd poky
$ git checkout -b zeus origin/zeus
$ source oe-init-build-env
```
You have to download and install the following existing OpenEmbeded Layers:
meta-openembedded, meta-xfce, meta-qt5, meta-musicians

## meta-meson: Odroid-C2 Linux Kernel
Please see the README in [meta-meson](https://github.com/Rezzonics/meta-meson)
Odroid C2 Linux Kernel 5.6 has been customized adding Audio drivers for specific audio board for Odroid-C2 based on CS4245 codec.

# How to build from scratch
PedalC2 development platform integrates pedalpi software components developed into a release that can be downloaded and run on popular hardware development boards.

Please see the README in [pedalpi-dev-platform](https://github.com/auto3000/pedalpi-dev-platform) [meta-pedalpi](https://github.com/auto3000/meta-pedalpi/) and [PedalPI v2](https://github.com/auto3000/pedalpii) for further information.

## pedalc2-dev-platform.git usage
To clone the project
```Shell
$ git clone https://github.com/rezzonics/pedalc2-dev-platform
```
To initiate the build environment use standard shell command on poky directory:
```Shell
$ source ../yocto-odroid/poky/oe-init-build-env.sh
```
To build:
```Shell
$ bitbake pedalpi-dev-platform
```
The resulting .wic image will appear in `tmp/deploy/images/`.

## Flash and run PedalPI on Odroid-C2 eMMC Flash
Type these commands:
```Shell
$ git clone https://github.com/rezzonics/pedalpi-dev-platform
$ cd pedalpi-dev-platform
$ source ../yocto-odroid/poky/oe-init-build-env.sh
$ bitbake pedalpi-dev-platform
$ sudo dd if=tmp/deploy/images/amlogic-dev-platform- of=/dev/sdXXX bs=4096  # XXX is your SD card
```
Plug the eMMC Flash into USB writer and plug USB writer with eMMC flash into Linux PC. Run Balena Etcher application open .wic image on images folder.

The Odroid-C2 connects automatically on ethernet network with DHCP. You may connect to the MOD-UI user interface [see screenshot](mod-ui-screenshot.png) at address [http://pedalpi](http://pedalpi) or the dynamically allocated IP address.
