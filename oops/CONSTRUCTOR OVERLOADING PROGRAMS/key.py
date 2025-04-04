import os

key = os.urandom(16)  # 16 bytes = 32 hex characters
hex_key = key.hex()
print(hex_key)  # Prints exactly 32 characters