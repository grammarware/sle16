{ pkgs ? import <nixpkgs> {} }:

pkgs.stdenv.mkDerivation {
  name = "benchmark";
  version = "0.0.1";
  src = ./.;
  buildInputs = [
    (pkgs.texlive.combine {
      inherit (pkgs.texlive) scheme-small;
    })
  ];
}
