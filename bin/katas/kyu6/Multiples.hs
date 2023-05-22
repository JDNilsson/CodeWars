module Multiples where

searchPermMult :: Int -> Int -> Int
searchPermMult max_value mult = searchPermMult' max_value mult 1


searchPermMult' :: Int -> Int -> Int -> Int
searchPermMult' max_value b c 
  | b*c >= max_value = return
  | digits (b*c) = return