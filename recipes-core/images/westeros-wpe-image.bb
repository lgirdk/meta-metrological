# Copyright (C) 2016 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

include recipes-core/images/core-image-minimal.bb

require wpe-image.inc

DESCRIPTION = "WPE-On-Westeros compositor image for RaspberryPi"
LICENSE = "MIT"

inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SPLASH_rpi = "psplash-raspberrypi"

IMAGE_FEATURES += "hwcodecs \
                   package-management \
                   ssh-server-openssh \
                   splash \
"

IMAGE_INSTALL += "kernel-modules \
                  packagegroup-westeros \
"
